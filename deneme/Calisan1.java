public class Calisan1 {
    
    protected String Adsoyad;
    protected int tell;
    protected String email;


    public Calisan1(String Adsoyad,int tell,String email){

        super();
        this.Adsoyad=Adsoyad;
        this.tell=tell;
        this.email=email;
    }

    protected void Giris(){
        
        System.out.println(GetAdsoyad()+ " tarafından giriş yapıldı");


    }

    protected void cikis(){
        
        System.out.println(GetAdsoyad()+ " tarafından cikis yapıldı");


    }
     
    protected void yemek(){
        
        System.out.println(GetAdsoyad()+ " yemek aldı");


    }
    protected void SetAdsoyad(String Adsoyad){


        this.Adsoyad=Adsoyad;
    }

    protected String GetAdsoyad(){
        return this.Adsoyad;
    }


    protected void Settell(int tell){


        this.tell=tell;
    }

    protected int  Gettell(){
        return this.tell;
    }

    protected void Setemail(String email){


        this.email=email;
    }

    protected String Getemail(){
        return this.email;
    }

}
