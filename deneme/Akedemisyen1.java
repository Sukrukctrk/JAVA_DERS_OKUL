public class Akedemisyen1 extends Calisan1 implements Devlet1 {

    protected String bolum;
    protected String gorev;
    protected String dersler;
    protected int sicilno;

    public Akedemisyen1(String bolum, String gorev, String dersler,String Adsoyad,int tell ,String email){


         super(Adsoyad,tell,email);
         
         this.bolum=bolum;
         this.gorev=gorev;
         this.dersler=dersler;


    }

    protected void dersegir(){

        System.out.println(GetAdsoyad()+" derse girdi");
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void setDersler(String dersler) {
        this.dersler = dersler;
    }

    public String getGorev() {
        return gorev;
    }

    public String getDersler() {
        return dersler;
    }

    public int getSicilno() {
        return this.sicilno;
    }

    public void setSicilno(int sicilno) {
       this.sicilno = sicilno;
    }

    


    
}
