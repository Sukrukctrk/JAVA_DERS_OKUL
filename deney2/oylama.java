import java.util.Scanner;

public class oylama {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

       
       int derece;
         
        String [] sorunlar= {"siyasi","savunma sektörü","eğitim","adalet","teknoloji"};

        int [][] dizim = new int[5][10];

        while (true) {
            
        


        for (int i = 0; i < sorunlar.length; i++) {
            System.out.println(i+1 +": "+sorunlar[i]);
            derece= scanner.nextInt();


            if(derece<=10 && derece>=1){

                dizim[i][derece]++;


            }
            else{
                System.out.println("derece 1 ile 10 arasında olmalıdır tekrar deneyin");
                i--;
            }
        }


        System.out.println("baska katılımcı carmı var=1 yok=0");
        int b= scanner.nextInt();

        if(b==0){
            break;
        }   
    }

    System.out.println("\nHer Konunun Ortalama Puanı:");
    for (int i = 0; i < sorunlar.length; i++) {
        int toplam = 0;
        int sayi = 0;
        for (int j = 0; j < 10; j++) {
            toplam += dizim[i][j] * (j + 1);
            sayi += dizim[i][j];
        }
        double ortalama = sayi > 0 ? (double) toplam / sayi : 0;
        System.out.printf("%-20s: %.2f\n", sorunlar[i], ortalama);
    }


    int maxToplam = 0;
    int minToplam = Integer.MAX_VALUE;
    String maxKonu = "";
    String minKonu = "";

    for (int i = 0; i < sorunlar.length; i++) {
        int toplam = 0;
        for (int j = 0; j < 10; j++) {
            toplam += dizim[i][j] * (j + 1);
        }
        if (toplam > maxToplam) {
            maxToplam = toplam;
            maxKonu = sorunlar[i];
        }
        if (toplam < minToplam) {
            minToplam = toplam;
            minKonu = sorunlar[i];
        }
    }


    System.out.println("\nEn Yüksek Toplam Puan Alan Konu:");
    System.out.println(maxKonu + " - Toplam Puan: " + maxToplam);

    System.out.println("\nEn Düşük Toplam Puan Alan Konu:");
    System.out.println(minKonu + " - Toplam Puan: " + minToplam);
    

    
    
    for (int i = 0; i < sorunlar.length; i++) {
        System.out.printf("%-20s |", sorunlar[i]);
        for (int j = 0; j < 10; j++) {
            System.out.print(" " + dizim[i][j] + " ");
        }
        System.out.println();
    }



    }
    
}


/*
 * Oylama uygulaması
Bu alıştırmada basit bir yoklama yazacaksınız. Kullanıcıların beş sosyal bilinç sorununu 1'den (en az önemli)
 10'a (en önemli) kadar derecelendirmelerini sağlayan program.

Sizin için önemli olan beş neden seçin (ör. siyasi sorunlar, küresel çevre sorunları).
 Beş nedeni depolamak için tek boyutlu dizi kullanın (String türünden) kullanın. 
 Anket yanıtlarını özetlemek için 5 satırlı, 10 sütunlu iki boyutlu dizi yanıtları
  kullanın (tür int), konular dizisindeki bir öğeye karşılık gelen her satır.
Program çalıştığında, kullanıcıdan her sorunu derecelendirmesini isteyin.
Arkadaşlarınızın ankete yanıt vermesini sağlayın.

a) Sol tarafta beş konu başlığı ve en üste 1'den 10'a derecelendirme ile tablo halinde bir rapor,
 her sütunda, her konu için alınan derecelendirmelerin sayısı listelenir.

b) Her satırın sağında, o satır için derecelendirmelerin ortalamasını gösterin.

c) Hangi konu toplamda en yüksek puanı aldı? Hem sorunu hem de toplam puanı görüntüleyin.


 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */