public class akedemisyen extends calisan {

    protected String bolum;
    protected String gorev;
    protected String dersler;


    public akedemisyen(String adsoyad,int telefon,String email,String bolum, String gorev,String dersler){



        super(adsoyad,telefon,email);

        this.bolum=bolum;
        this.gorev=gorev;
        this.dersler=dersler;
    }

    protected void dersegir(){
        System.out.println(getadsoya());
    }


    public String getbolum(){

        return this.bolum;
    }

    public void setbolum(String bolum){

        this.bolum=bolum;
    }
      

    public String getgorev(){

        return this.gorev;
    }

    public void setgorev(String gorev ){

        this.gorev=gorev;
    }

    public String getdersler(){

        return this.bolum;
    }

    public void setdersler(String dersler){

        this.dersler=dersler;
    }

    
}
