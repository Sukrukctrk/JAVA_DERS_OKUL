public class ö7 {
    int yas;
    int no;
    String isim;
    String soyisim;


    public ö7(int yas,int no,String isim,String soyisim){

        this.yas=yas;
        this.no=no;
        this.isim=isim;
        this.soyisim=soyisim;
        
}


public static void main(String[] args) {
    ö7 ogrenci = new ö7(19, 578, "sukru", "kocaturk");
    System.out.println(""+ogrenci.isim);
    

}


}
