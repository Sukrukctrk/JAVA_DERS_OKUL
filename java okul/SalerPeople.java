public class SalerPeople {
    String isim;
    String soyisim;
    double mass;
    double commission;
    double total;
    static int productCount;

    // Kurucu metot
    SalerPeople(String isim, String soyisim) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.mass = 1500;
        this.commission = 0.05;
        this.total = this.mass;
    }

    // Satış elemanı bilgilerini ve maaşı gösteren metot
    void show() {
        System.out.println("Ad: " + this.isim);
        System.out.println("Soyad: " + this.soyisim);
        System.out.println("Haftalık Maaş: " + this.mass);
        System.out.println("Komisyon: " + (this.commission * 100) + "%");
        System.out.println("Toplam Maaş: " + this.total);
        System.out.println("Satılan Ürün Adedi: " + SalerPeople.productCount);
        /*
         * Satış komisyon hesaplama: Haftalık maaş 1500 TL'dir. Her sattığı üründen %5 komisyonu prim olarak maaşlarına eklenmektedir. 
         * a. SalerPeaple sınıfından nesne oluşturunuz. b. SalerPeaple sınıfı içinde static ürünCaunt adında bir değişken ve bu değişkeni 
         * saydırarak satış personeli kaç adet ürün satmış ekrana yazdırınız. c. SalerPeaple sınıfında show() adında bir metot oluşturarak 
         * satış elemanı adı soyadı, haftalık maaşı, komisyon ve toplam maaşı gösteriniz. Kaç adet ürün satıldığını da yazdırınız. d. 
         * Main sınıfı, saler1 nesnesi oluşturulacaktır. e. Show metodu çağrılarak istenilen tüm bilgiler ekrana yazdırılacaktır. f. 
         * Zaman yeterli olması durumunda ürün ID belirlenip hangi üründen kaç adet satılmış bilgisi ekrana yazdırılacak.
         * 
         * 
         * 
         * 
         */

        
    }
}
