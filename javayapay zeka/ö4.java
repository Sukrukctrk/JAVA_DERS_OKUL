import java.util.Scanner;

public class ö4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        System.out.println("Lütfen iki adet tam sayı giriniz:");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("Yapmak istediğiniz işlemi girin (+ / * - ):");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Hata: Sıfıra bölme yapılamaz.");
                }
                break;
            default:
                System.out.println("Geçersiz işlem.");
                break;
        }
    }
}
