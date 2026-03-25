import java.util.Scanner;
public class ders11_noth {

    public static void main(String[] args) {
     
        Scanner scanner= new Scanner(System.in);
        // not ortalaması hesabı

        System.err.println("lutfen vize notunuzu girin");
        double a= scanner.nextDouble();

        System.out.println("lutfen final notunuzu girin");
        Double b= scanner.nextDouble();


        double ortalama= (a*0.3)+(b*0.7);

        if (ortalama>=80){
            System.out.println("AA");
        }
        
        else if (ortalama<80 && ortalama>=75){
            System.out.println("AB");
        }

        else if (ortalama<75 && ortalama>=70){
            System.out.println("CB");
        }

        else if (ortalama<70 && ortalama>=60){
            System.out.println("Db");
        }

        else if (ortalama<60 && ortalama>=55){
            System.out.println("DD");
        }
        
        else if (ortalama<55){
            System.err.println("kaldın");
        }

    }
    
}
