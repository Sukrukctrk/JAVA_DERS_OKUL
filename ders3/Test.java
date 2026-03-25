public class Test{

    public static void main(String[] args) {

        Employe e1= new Employe();
        Employe e2 =new Employe("sukru", "kocatürk");

        e2.infoBox();

        Employe e3=new Employe("ahmet", "sdfhsvdf", 50000);
        e3.infoBox();
        e3.makeRaise(1000);
        e3.infoBox();


        System.out.println("***********************************************************");


        Engineer n1= new Engineer();
        n1.setName("ali");
        n1.setSurName("kocaturk");
        n1.setJob(" bilgi işlem");
        n1.setAnualPremit(30);
        n1.setSalary(80000);

        n1.infoBox();
         n1.test();
        Engineer n2= new Engineer(null, null);



        Employe e4=new Engineer("c ", "  b ");  // burdada polimorfizim yaptık emloyenenin altındaki enginerr constructırını kkullandık
        
        e4.infoBox();

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }





    
}