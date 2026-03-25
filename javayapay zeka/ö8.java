 class Arabba {
    String renk;
    String model;
    int yas;
    int teker;
    int kapı;



    public Arabba (int teker){


        this.renk="mavi";
        this.model ="honda ";
        this.yas=19;
        this.kapı=4;
        
    }

    public void bilgigoster() {

      System.out.println("yas"+this.yas);
      System.out.println("model"+this.model);
      System.out.println("teker"+this.teker);
      System.out.println("kapı"+this.kapı);
      System.out.println("renk"+this.renk);
      



    }
}


public class ö8 {
    
    public static void main(String[] args) {
        Arabba araba= new Arabba(4);

        araba.bilgigoster();
    }
    

    
} 