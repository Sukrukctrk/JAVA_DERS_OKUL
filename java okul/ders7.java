import java.util.Scanner;

public class ders7 {
    public static void main(String[] args) {

        // Vücut kitle endeksini bulup hangi sınıfta olduğunu yazdıralım

        Scanner input = new Scanner(System.in);
        int boy, kilo;
        float bmi, tmp;
        
        System.out.println("Boyunuzu girin :");
        boy = input.nextInt();

        System.out.println("Kilonuzu girin :");
        kilo = input.nextInt();
        
        // Boyu metreye çeviriyoruz
        tmp = (boy / 100.0f) * (boy / 100.0f);

        bmi = kilo / tmp;
        
        if (bmi > 30) {

            System.out.println("Obezsiniz.");

        } else if (bmi <= 30 && bmi > 25) {
            System.out.println("Şişmansınız.");

        } else if (bmi <= 25 && bmi >= 18.5) {
            System.out.println("Normalsiniz.");
            
        } else if (bmi < 18.5) {
            System.out.println("Zayıfsınız.");
        }

        input.close();
    }
}
