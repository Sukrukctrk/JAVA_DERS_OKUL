public class cat extends Anımal implements pat{

    protected String name;


    public cat (int legs,String name){

        super(legs);
        this.name=name;
    }

    public cat (int legs){
        super(legs);
    }




    
    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }


    public void play(){

        System.out.println("oyun oumadı");
    }

    public void eat(){
        System.out.println("yemek yedi");
    }


    
}
