import java.util.Scanner;

public class ders18 {
    public static int ebob(int a, int b) {
        int gecici, sonuc = 0;
        if (b >= a) {
            gecici = b;
            b = a;
            a = gecici;
        }
        for (int i = 1; i <= b; i++) { // döngü 1'den başlamalıdır
            if (a % i == 0 && b % i == 0) {
                sonuc = i;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iki adet sayi degeri giriniz:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // EBOB BULCAZ
        System.out.println("EBOB: " + ebob(a, b)); // Ekstra + işareti gereksiz
    }
}
