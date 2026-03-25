
   /* 
          Satış komisyon hesaplama: Haftalık maaş 1500 TL'dir. Her sattığı üründen %5 komisyonu prim olarak maaşlarına eklenmektedir. 
          a. SalerPeaple sınıfından nesne oluşturunuz. b. SalerPeaple sınıfı içinde static ürünCaunt adında bir değişken ve bu değişkeni 
          saydırarak satış personeli kaç adet ürün satmış ekrana yazdırınız. c. SalerPeaple sınıfında show() adında bir metot oluşturarak 
          satış elemanı adı soyadı, haftalık maaşı, komisyon ve toplam maaşı gösteriniz. Kaç adet ürün satıldığını da yazdırınız. d. 
          Main sınıfı, saler1 nesnesi oluşturulacaktır. e. Show metodu çağrılarak istenilen tüm bilgiler ekrana yazdırılacaktır. f. 
          Zaman yeterli olması durumunda ürün ID belirlenip hangi üründen kaç adet satılmış bilgisi ekrana yazdırılacak.
      
          
         */

         class SatisElemani {
            String ad;
            String soyad;
            double haftalikMaas;
            double toplamMaas;
            static int satilanUrunSayisi;
            static double toplamKomisyon;
        
           
            SatisElemani(String ad, String soyad) {
                this.ad = ad;
                this.soyad = soyad;
                this.haftalikMaas = 1500;
                this.toplamMaas = this.haftalikMaas;
            }
        
            
            void goster() {
                System.out.println("Ad: " + this.ad);
                System.out.println("Soyad: " + this.soyad);
                System.out.println("Haftalık Maaş: " + this.haftalikMaas);
                System.out.println("Komisyon: " + SatisElemani.toplamKomisyon);
                System.out.println("Toplam Maaş: " + this.toplamMaas);
                System.out.println("Satılan Ürün Adedi: " + SatisElemani.satilanUrunSayisi);
            }
        }
        
        public class Main {
            public static void main(String[] args) {
                // Satış elemanı nesnesi oluşturma
                SatisElemani satis1 = new SatisElemani("şükrü", "kocatürk");
        
                
                int satilanUrunler = 10; 
                double urunFiyati = 100; 
                double komisyonOrani = 0.05;
        
                for (int i = 0; i < satilanUrunler; i++) {
                    double komisyon = urunFiyati * komisyonOrani;
                    SatisElemani.satilanUrunSayisi++;
                    SatisElemani.toplamKomisyon += komisyon;
                    satis1.toplamMaas += komisyon;
                }
        
                
                satis1.goster();
            }
        }
        