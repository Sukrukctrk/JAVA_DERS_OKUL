public class ogretimgor extends akedemisyen  {
    protected String unvan;


    public ogretimgor(String ad_soyad,int telefon,String email,String bolum,String gorev, String dersler,String unvan){
        super(ad_soyad,telefon,email,bolum,gorev,dersler);

        this.unvan=unvan;


    }



    public String getunvan(){
        return this.unvan;
    }

    public void setunvan(String unvan){

        this.unvan=unvan;
    }

    
    
}
