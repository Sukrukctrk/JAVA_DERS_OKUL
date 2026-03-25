public class Asistan1 extends Akedemisyen1{

    protected String yuksekogetim;

    public Asistan1 (String yuksekogretim,String bolum, String gorev, String dersler,String Adsoyad,int tell ,String email){
        
        super(bolum, gorev, dersler, Adsoyad, tell, email);

        this.yuksekogetim=yuksekogretim;


    }

    public void labagir(){

        System.out.println(GetAdsoyad() +" laba girdi");
    }

    public String getYuksekogetim() {
        return yuksekogetim;
    }

    public void setYuksekogetim(String yuksekogetim) {
        this.yuksekogetim = yuksekogetim;
    }

    
    
}
