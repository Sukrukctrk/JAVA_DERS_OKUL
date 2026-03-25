public class calisan extends devlet  {
    
    protected String ad_soyad;
    protected int telefon;
    protected String  email;


    public calisan(String ad_soyad,int telefon,String email){


super();
ad_soyad=this.ad_soyad;
telefon=this.telefon;
email=this.email;


    }

    public void giris(){

        System.out.println((ad_soyad+"giris yapti"));
    }

    public void cikiş(){

        System.out.println((ad_soyad+"cikiş  yapti"));
    }

    public void yemek(){

        System.out.println(ad_soyad+"yemek yedi");
    }


    public void setadsoyad(String ad_soyad){

        this.ad_soyad=ad_soyad;
    }

    public String getadsoya(){

        return this.ad_soyad;
    }

    public void setadtelefon(int telefon){

        this.telefon=telefon;
    }

    public int gettelefon(){

        return this.telefon;
    }


    public void setamail(String email){

        this.email=email;
    }

    public String getemail(){

        return this.email;
    }


}
