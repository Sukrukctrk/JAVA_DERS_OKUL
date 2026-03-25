public class asistan extends akedemisyen {

    protected String yuksekogretim;

    public asistan(String ad_soyad,int telefon,String email,String bolum,String gorev, String dersler,String yuksekogretim){

        super(ad_soyad,telefon,email,bolum,gorev,dersler);
        this.yuksekogretim=yuksekogretim;




    }
    
    public void labagir(){
        System.out.println(getyuksekogretim()+ " "+getadsoya());


    }
    
    public String getyuksekogretim(){
        return this.yuksekogretim;
    }

    public void setyuksekogretim(String yuksekogretim){

        this.yuksekogretim=yuksekogretim;
    }


    
    
}
