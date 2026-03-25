import java.util.Scanner;

public class ders4 {
    
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int sum;

        System.out.println("sayi biri girin:");
        number1 = input.nextInt();
        System.out.println("sayi iki yi girin :");
        number2 = input.nextInt();
        sum = number1 + number2;

        System.out.println("toplam: " + sum);
    }
}
