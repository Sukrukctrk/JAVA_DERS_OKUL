public class fısh extends Anımal implements pat{

    protected String name;


    
    public fısh (int legs){
        super(legs);
    }

    public void valk(){
        System.out.println("yürüdü");
    }


     
    public void setname(String name ){

        this.name =name;
    }



    public String getname() {
        return name;
    }


    public void play(){
        System.out.println("balık oyun oynadı");
    }

    

    
}
