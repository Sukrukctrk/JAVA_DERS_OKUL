import java.util.Scanner;

public class ders5_scannerinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lutfen yasinizi girin:");
        int yas = scanner.nextInt();
        System.out.println("Yasiniz: " + yas);

        System.out.println("Sayi girin:");
        double sayi = scanner.nextDouble();
        System.out.println("Sayim: " + sayi);
        
        // Bu `nextLine()` çağrısı yeni satır karakterini temizler.
        scanner.nextLine();

        System.out.println("Bir string girin:");
        String yazi = scanner.nextLine();
        System.out.println("Yazim: " + yazi);

        scanner.close();
    }
}
