public class Worker extends Employe implements Person {
    private String departman;

    public Worker(String name,String surName){

        super(name, surName);
        this.departman="Bilgi işlem ";
        setJob("teknisyen ");
        setAnualPremit(10);
        setSalary(45000);


    }

    protected String getDepartman() {
        return departman;
    }

    protected void setDepartman(String departman) {
        this.departman = departman;
    }

    public void gender(String c){

        String cins=c;

        System.out.println("işci cinsiyeti"+cins);
     }

    
}
