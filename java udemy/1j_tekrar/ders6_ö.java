import java.util.Scanner;

public class ders6_ö {
 public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    int boy;
    int kilo;
    float bkef;

   System.out.println("boyunuzu girin");
   boy =scanner.nextInt();

   System.out.println("kilonuzu girin");
   kilo=scanner.nextInt();


   bkef= (float)((boy*boy)/kilo);
   System.out.println(("bke siniz"+bkef));
    
 }   
}
