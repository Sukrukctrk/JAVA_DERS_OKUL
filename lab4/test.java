public class test {
    public static void main(String[] args){
       
        Anımal a1= new Anımal(4);

        System.out.println(a1.getLegs());
        a1.eat();
        a1.valks();

        Spider a2=new Spider(8);
        System.out.println(a2.getLegs());

        a2.eat();

        cat a3 = new cat(4, "sukru");
        a3.eat();

  

   

    }
}
