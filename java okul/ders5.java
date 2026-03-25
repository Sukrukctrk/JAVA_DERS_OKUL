import java.util.Scanner;

public class ders5 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int toplam;
        int fark;
        int bolum;
        int carpım;
        int sayi,bb,ob,yb,bib,ob;

        System.out.println("sayi biri girin:");
        number1 = input.nextInt();
        System.out.println("sayi iki yi girin :");
        number2 = input.nextInt();

        toplam= number1 + number2;
        if(number1>=number2){

            fark =number1-number2;
        }
        
        else{
            fark=number2-number1;
        }
        
     
        carpım=number1*number2;
        bolum=number1/number2;


        System.out.println("toplam: " + toplam);
        System.out.println("carpım: " + carpım);
        System.out.println("fark: " + fark);
        System.out.println("bolum: " + bolum);


    }
}
