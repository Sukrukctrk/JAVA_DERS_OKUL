import java.util.Scanner;
public class ders8_ö {
    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
    
        // iki sayinin yerlerini degiştirme

        int a,b,gecici;
        System.out.println(("sayi sayi girin"));
        a= scanner.nextInt();

        System.out.println(("sayi sayi girin"));
        b= scanner.nextInt();

       System.out.println(("degiştirmeden once "+a +"\t"+ b));
       

        gecici=a;
        a=b;
        b=gecici;
        System.out.println(("degiştirdikten sonra once "+ a +"\t"+ b));
       
        }
    }
    
