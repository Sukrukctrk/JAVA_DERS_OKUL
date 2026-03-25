public class verihazirlama extends memur{
    protected String gorev;

    public verihazirlama(String ad_soyad,int telefon,String email, String departman,String mesai,String gorev){

        super(ad_soyad, telefon, email, departman, mesai);
        this.gorev=gorev;
    }
    
    public void setgorev (String gorev){

        this.gorev=gorev;
    }

    public String getgorev (){

        return this.gorev;
    }
}
