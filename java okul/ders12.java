import java.util.Scanner;

public class ders12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("kac tane kişşi gireceksiniz:");
        int n = scanner.nextInt();
        int toplam=0,not;
        double ortalama;

        int i =0;
        System.out.println("lutfen notları girin");
        while (i<n) {
            not=scanner.nextInt();
            toplam+=not;
            i++;

            
        }

        ortalama= toplam/n;
        
        
        
        System.out.println("ortalama:"+ortalama);

    }
    
}
