public class Employe {
    /*
     *  -  privete
    //  #  protected

     * 
     * 
     * 
     */
     private String name;
     private String surName;
     private String job;
     private int salary;
     private int anualPremit;



    public  Employe(){

    }


    public Employe (String name,String surName){
        this.name=name;
        this.surName=surName;
        this.job="calisan";
        this.salary=30000;
        this.anualPremit=10;  // izin
    }


    public Employe (String name,String surName,int salary){

        this.name=name;
        this.surName=surName;
        this.salary=salary;

        if(salary>3000){
        this.job="kıdemli caliasn";
        this.anualPremit+=5;
    }


    }




    protected int makeRaise(int artis){
       int  nsalary=salary+artis;
       return nsalary;


    }

    protected void infoBox(){


        System.out.println("çalışan adi soyadi :" +getName()+" "+getSurName());
        System.out.println("çalışan maaş :"+getSalary());
        System.out.println("çalışan yıllık izin"+getAnualPremit());

    }

    protected void test(){
        System.out.println("eploye sınıfı");
    }

 
    
     protected String getName() {
        return name;
    }

     protected void setName(String name) {
        this.name = name;
    }
    protected void setSurName(String surName) {
        this.surName = surName;
    }
    protected void setJob(String job) {
        this.job = job;
    }
    protected void setSalary(int salary) {
        this.salary = salary;
    }
    protected void setAnualPremit(int anualPremit) {
        this.anualPremit = anualPremit;
    }
  
    protected String getSurName() {
        return surName;
    }
    protected String getJob() {
        return job;
    }
    protected int getSalary() {
        return salary;
    }
    protected int getAnualPremit() {
        return anualPremit;
    }


     
    
}
