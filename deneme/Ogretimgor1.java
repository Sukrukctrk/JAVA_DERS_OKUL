public class Ogretimgor1 extends Akedemisyen1 {

    protected String unvan;

    public Ogretimgor1(String unvan,String bolum, String gorev, String dersler,String Adsoyad,int tell ,String email){

        super(bolum, gorev, dersler, Adsoyad, tell, email);

        this.unvan=unvan;
    }
    

    public void dersegir(){

        System.out.println(GetAdsoyad()+" derse girdi");
    }
    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    
    
}
