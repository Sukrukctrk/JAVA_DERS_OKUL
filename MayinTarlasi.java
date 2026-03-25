// Ana sınıf
public class MayinTarlasi {
    public static void main(String[] args) {
        Oyun oyun = new Oyun();
        oyun.oyunuBaslat();
    }
}

// Tablo sınıfı
class Tablo {
    protected int boyut;
    protected char[][] gorunenTablo;
    protected int[][] gizliTablo;

    public Tablo(int boyut) {
        this.boyut = boyut;
        gorunenTablo = new char[boyut][boyut];
        gizliTablo = new int[boyut][boyut];
        tabloyuOlustur();
    }

    // Tabloyu oluşturur ve görünür tabloyu '#' ile doldurur
    private void tabloyuOlustur() {
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                gorunenTablo[i][j] = '#';
                gizliTablo[i][j] = 0;
            }
        }
    }

    public void tabloyuYazdir() {
        System.out.println("   " + "01234567".substring(0, boyut));
        for (int i = 0; i < boyut; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < boyut; j++) {
                System.out.print(gorunenTablo[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void mayinlariYerleştir(int mayinSayisi) {
        for (int k = 0; k < mayinSayisi; k++) {
            int satir, sutun;
            do {
                satir = (int) (Math.random() * boyut);
                sutun = (int) (Math.random() * boyut);
            } while (gizliTablo[satir][sutun] == -1);
            gizliTablo[satir][sutun] = -1;
            komsuSayilariniArttir(satir, sutun);
        }
    }

    private void komsuSayilariniArttir(int satir, int sutun) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int yeniSatir = satir + i;
                int yeniSutun = sutun + j;
                if (yeniSatir >= 0 && yeniSatir < boyut && yeniSutun >= 0 && yeniSutun < boyut && gizliTablo[yeniSatir][yeniSutun] != -1) {
                    gizliTablo[yeniSatir][yeniSutun]++;
                }
            }
        }
    }
}

// Oyun sınıfı, Tablo sınıfından kalıtım alır
class Oyun extends Tablo {
    private int mayinSayisi;
    private boolean oyunDevam;

    public Oyun() {
        super(8); // Varsayılan tablo boyutu 8x8
        this.mayinSayisi = 10; // Varsayılan mayın sayısı
        this.oyunDevam = true;
        mayinlariYerleştir(mayinSayisi);
    }

    public void oyunuBaslat() {
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");
        while (oyunDevam) {
            tabloyuYazdir();
            oyuncuHamlesiAl();
        }
    }

    private void oyuncuHamlesiAl() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Hamlenizi giriniz (ör: c 2 3): ");
        String[] girdi = scanner.nextLine().split(" ");
        char islem = girdi[0].charAt(0);
        int satir = Integer.parseInt(girdi[1]);
        int sutun = Integer.parseInt(girdi[2]);

        if (islem == 'c') {
            hamleYap(satir, sutun);
        } else if (islem == 'd') {
            bayrakKoy(satir, sutun);
        } else {
            System.out.println("Geçersiz işlem!");
        }
    }

    private void hamleYap(int satir, int sutun) {
        if (gizliTablo[satir][sutun] == -1) {
            System.out.println("Mayına bastınız! Kaybettiniz.");
            oyunDevam = false;
        } else {
            cevreyiKesfet(satir, sutun);
            if (oyunuKontrolEt()) {
                System.out.println("Tebrikler! Tüm mayınları buldunuz.");
                oyunDevam = false;
            }
        }
    }

    private void bayrakKoy(int satir, int sutun) {
        if (gorunenTablo[satir][sutun] == '#') {
            gorunenTablo[satir][sutun] = 'D';
        } else {
            System.out.println("Bu kareye bayrak koyamazsınız.");
        }
    }

    private void cevreyiKesfet(int satir, int sutun) {
        if (satir < 0 || satir >= boyut || sutun < 0 || sutun >= boyut || gorunenTablo[satir][sutun] != '#') {
            return;
        }
        if (gizliTablo[satir][sutun] > 0) {
            gorunenTablo[satir][sutun] = (char) ('0' + gizliTablo[satir][sutun]);
        } else {
            gorunenTablo[satir][sutun] = '0';
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    cevreyiKesfet(satir + i, sutun + j);
                }
            }
        }
    }

    private boolean oyunuKontrolEt() {
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (gorunenTablo[i][j] == '#' && gizliTablo[i][j] != -1) {
                    return false;
                }
            }
        }
        return true;
    }
}
