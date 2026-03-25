public class ders17 {
    public static void asal(int a) {
        
        for (int b = 2; b < a; b++) {
            int i = 2;
            int asalMi = 1;  // 1: Asal, 0: Asal değil
            while (i < b) {
                if (b % i == 0) {
                    asalMi = 0;  // Asal değil
                    break;
                }
                i++;
            }
            if (asalMi == 1) {
                System.out.println(b);
            }
        }
    }

    public static void main(String[] args) {
        // 1'den 1000'e kadar olan asal sayıları ekrana bastırma
        asal(1000);
    }
}
