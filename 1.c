#include <stdlib.h>
#include <time.h>
#include <stdio.h>
#include <string.h>

// Sabitler
#define TABLO_BOYUTU 8 // Tablo boyutu
#define NORMAL_MAYIN 3 // Kullanılacak mayın sayısı
#define KAZANMA 1      // Oyunu kazandığınız durum
#define KAYBETME -1    // Oyunu kaybettiğiniz durum
#define DEVAM 0        // Oyunun devam ettiği durum

// Global Değişkenler
char oyuncuTablosu[TABLO_BOYUTU + 2][TABLO_BOYUTU + 2]; // Oyuncunun gördüğü tablo
int gizliTablo[TABLO_BOYUTU + 2][TABLO_BOYUTU + 2];     // Mayın ve komşuluk bilgilerini tutan tablo
int mayinSayisi, bayrakSayisi = 0;                      // Mayın ve bayrak sayacı

// Fonksiyon Prototipleri
void gizliTabloOlustur();
void oyuncuTablosunuBaslat();
void gizliTabloyuGoster();
void oyuncuTablosunuGoster();
void mayinlariYerlestir();
int oyunuKontrolEt();
void cevreyiKesfet(int satir, int sutun);
int kaz(int satir, int sutun);

int main(void) {
    int satir, sutun, durum;
    int yenidenBaslat;
    char islem; // Kullanıcının yapacağı işlem

    printf("Mayın Tarlası oyununa hoş geldiniz!\n");
    gizliTabloOlustur();
    oyuncuTablosunuBaslat();

    do {
        oyuncuTablosunuGoster();
        printf("\nLütfen şu formatta giriniz: c,satir,sutun (kaz) | d,satir,sutun (bayrak) | e,satir,sutun (bayrak kaldır)\n");
        scanf(" %c,%d,%d", &islem, &satir, &sutun);
        printf("\n");

        if (islem == 'c') {
            durum = kaz(satir, sutun);
        } else if (islem == 'd') {
            if (mayinSayisi > bayrakSayisi) {
                bayrakSayisi++;
                oyuncuTablosu[satir][sutun] = 'D';
                durum = oyunuKontrolEt();
            }
        } else if (islem == 'e') {
            if (bayrakSayisi > 0) {
                bayrakSayisi--;
            }
            oyuncuTablosu[satir][sutun] = '#';
            durum = kaz(satir, sutun);
        }

        if (durum == KAYBETME) {
            printf("Oyunu kaybettiniz!\n");
            gizliTabloyuGoster();
            printf("Tekrar oynamak ister misiniz? [1-Evet][0-Hayır]: ");
            scanf("%d", &yenidenBaslat);
            if (yenidenBaslat == 1) {
                bayrakSayisi = 0;
                durum = DEVAM;
                gizliTabloOlustur();
                oyuncuTablosunuBaslat();
            } else {
                printf("Teşekkürler, görüşmek üzere!\n");
                return 0;
            }
        }

        if (durum == KAZANMA) {
            printf("Tebrikler! Oyunu kazandınız!\n");
            gizliTabloyuGoster();
            printf("Tekrar oynamak ister misiniz? [1-Evet][0-Hayır]: ");
            scanf("%d", &yenidenBaslat);
            if (yenidenBaslat == 1) {
                bayrakSayisi = 0;
                durum = DEVAM;
                gizliTabloOlustur();
                oyuncuTablosunuBaslat();
            } else {
                printf("Teşekkürler, görüşmek üzere!\n");
                return 0;
            }
        }
    } while (1);

    return 0;
}

void gizliTabloOlustur() {
    int i, j;
    mayinSayisi = NORMAL_MAYIN;

    // Gizli tabloyu sıfırla
    for (i = 0; i <= TABLO_BOYUTU + 1; i++) {
        for (j = 0; j <= TABLO_BOYUTU + 1; j++) {
            gizliTablo[i][j] = 0;
        }
    }

    // Çerçeve ekle
    for (i = 0; i <= TABLO_BOYUTU; i++) {
        gizliTablo[i][0] = 1;
        gizliTablo[i][TABLO_BOYUTU + 1] = 1;
    }
    for (j = 0; j <= TABLO_BOYUTU; j++) {
        gizliTablo[0][j] = 1;
        gizliTablo[TABLO_BOYUTU + 1][j] = 1;
    }

    // Mayınları yerleştir
    mayinlariYerlestir();
}

void oyuncuTablosunuBaslat() {
    int i, j;

    // Oyuncunun tablosunu sıfırla
    for (i = 0; i <= TABLO_BOYUTU + 1; i++) {
        for (j = 0; j <= TABLO_BOYUTU + 1; j++) {
            oyuncuTablosu[i][j] = '#';
        }
    }

    // Çerçeve ekle
    for (i = 0; i <= TABLO_BOYUTU; i++) {
        oyuncuTablosu[i][0] = '*';
        oyuncuTablosu[i][TABLO_BOYUTU + 1] = '*';
    }
    for (j = 0; j <= TABLO_BOYUTU; j++) {
        oyuncuTablosu[0][j] = '*';
        oyuncuTablosu[TABLO_BOYUTU + 1][j] = '*';
    }
}

void gizliTabloyuGoster() {
    int i, j;

    printf("\nGizli Tablo:\n");
    for (i = 1; i <= TABLO_BOYUTU; i++) {
        for (j = 1; j <= TABLO_BOYUTU; j++) {
            printf("%3d", gizliTablo[i][j]);
        }
        printf("\n");
    }
}

void oyuncuTablosunuGoster() {
    int i, j;

    printf("\nOyuncu Tablosu:\n");
    for (i = 1; i <= TABLO_BOYUTU; i++) {
        for (j = 1; j <= TABLO_BOYUTU; j++) {
            printf("%3c", oyuncuTablosu[i][j]);
        }
        printf("\n");
    }
}

void mayinlariYerlestir() {
    srand(time(NULL));
    int i, satir, sutun;

    for (i = 1; i <= mayinSayisi; i++) {
        satir = 1 + rand() % TABLO_BOYUTU;
        sutun = 1 + rand() % TABLO_BOYUTU;

        if (gizliTablo[satir][sutun] == -1) {
            i--; // Mayın zaten varsa yeniden dene
            continue;
        }

        gizliTablo[satir][sutun] = -1;

        // Çevreye mayın komşuluğu ekle
        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if (gizliTablo[satir + x][sutun + y] != -1) {
                    gizliTablo[satir + x][sutun + y]++;
                }
            }
        }
    }
}

int oyunuKontrolEt() {
    int i, j, dogruBayrak = 0;

    for (i = 1; i <= TABLO_BOYUTU; i++) {
        for (j = 1; j <= TABLO_BOYUTU; j++) {
            if (oyuncuTablosu[i][j] == 'D' && gizliTablo[i][j] == -1) {
                dogruBayrak++;
            }
        }
    }

    return (dogruBayrak == mayinSayisi) ? KAZANMA : DEVAM;
}

void cevreyiKesfet(int satir, int sutun) {
    oyuncuTablosu[satir][sutun] = '0' + gizliTablo[satir][sutun];

    for (int x = -1; x <= 1; x++) {
        for (int y = -1; y <= 1; y++) {
            if (gizliTablo[satir + x][sutun + y] > 0 && oyuncuTablosu[satir + x][sutun + y] == '#') {
                oyuncuTablosu[satir + x][sutun + y] = '0' + gizliTablo[satir + x][sutun + y];
            }
        }
    }
}

int kaz(int satir, int sutun) {
    if (gizliTablo[satir][sutun] == -1) {
        return KAYBETME;
    }

    cevreyiKesfet(satir, sutun);
    return oyunuKontrolEt();
}
