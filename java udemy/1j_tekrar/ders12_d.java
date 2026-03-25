import java.util.Scanner;

public class ders12_d {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        
        // iki değişken tanımla ya hoşgeldin ya parola yanlış 3 giriş hakkı var;
        
        int sifre=1453;
        int a=0;
        while (a<3) {
            System.out.println("lutfen sifre giriniz");
            int b= scanner.nextInt();

            if(sifre!=b){

                System.out.println("yanlıs sifre girdiniz lutfen tekrar deneyiniz");

                a++;
                
            }
            
            else{
                System.out.println("giriş yapılıyor");
                break ;
            }
            
        }

    }
    
}
