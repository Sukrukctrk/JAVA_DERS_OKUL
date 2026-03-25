public class memur extends calisan {

    protected String departman ;
    protected String mesai;
    protected String sicilno;
   

    public memur(String ad_soyad,int telefon,String email, String departman,String mesai){

        super(ad_soyad,telefon,email);
        this.mesai=mesai;
        this.departman=departman;

    }
    

    public String getdepartman(){


        return this.departman;
    }

    public void calis(){

        System.out.println(getdepartman()+" "+getadsoya());
    }
    


    
}
