import java.util.Scanner;

public class ders6 {
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int number1,bb,ob,yb,bib,onb;
        
        System.out.println("sayi  girin:");
        number1 = input.nextInt();
        bb= number1 %10;
        ob=number1%100/10;
        yb=number1%1000/100;
        bib=number1%10000/1000;
        onb= number1%100000/10000;

        System.out.println("bb: " + bb);
        System.out.println("ob: " + ob);
        System.out.println("yb: " + yb);
        System.out.println("bib: " + bib);
        System.out.println("onb: " + onb);


       
    }
}
