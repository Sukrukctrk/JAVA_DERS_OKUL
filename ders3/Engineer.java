public class Engineer  extends Employe implements Person{

    public Engineer(){}

    public Engineer(String name,String surName){
        super(name, surName);

        setJob("MÜHENDİS");
        setSalary(50000);
        setAnualPremit(10);
        

    }

    public Engineer (String name,String surName,int salary){


        super(name, surName,salary);
        setSalary(salary);
        if(salary>5000){
            setJob("kıdemli mühemdis ");
            setAnualPremit(15);

        }


    }


    protected int makeRaise(int artis){
        int  nsalary=getSalary()+artis+10000;
        return nsalary;

     }
    
     protected void test(){

        // üst sınıfın fonksiyonunu override etmeden çağırmamızı sağlar
        super.test();
        System.out.println("enginer sınıfı");
    }

     protected void infoBox(){
       
        System.out.println("mühendis adı soyadı :"+ getName() +""+getSurName());
        System.out.println("mühendis maaş :" + getSalary());
        System.out.println("mühendis yıllık izin"+getAnualPremit());





     }

     public void gender(String c){

        String cins=c;

        System.out.println("muhendis cinsiyeti"+cins);
     }
}
