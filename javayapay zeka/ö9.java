class hasta {

    int yaş;
    String cinsiyet;
    String hastalık;
    String ilaç;
    int muayneü;


 
 public hasta (){

        this.yaş=67;
        this.cinsiyet="kadın";
        this.hastalık="şeker";
        this.muayneü=1500;
        this.ilaç="insülin";
    }
    

void bilgigoster(){


System.out.println("kadın: "+this.cinsiyet);
System.out.println("yas: "+this.yaş);
System.out.println("hastalık: "+this.hastalık);
System.out.println("muayne ücreti :"+this.muayneü);
System.out.println("ilaç :"+this.ilaç);

}
   
}


public class ö9 {
public static void main(String[] args) {

    hasta hasta1= new hasta();

    hasta1.bilgigoster();
  
}

}