import java.util.Scanner;

public class ders9_ö {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        // dik üçgenin hipotonusunu bulma

        int a,b;
        double hipo;
       
        System.out.println("lutfen kanar uzunlugu girin");
        a= scanner.nextInt();

        System.out.println("lutfen kanar uzunlugu girin");
        b= scanner.nextInt();
        
        
        hipo =Math.sqrt((a*a)+(b*b));
        
        System.out.println(" hipotenis uzunlugu "+hipo);
        





    }
    
}
