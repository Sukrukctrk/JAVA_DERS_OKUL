
import java.util.Scanner;
public class ders10_switc_c_ö {
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("lutfen yapmak istediniz işlemi girin(1.+ 2./ 3.- 4.*)");
        
        int a = scanner.nextInt();
        System.out.println("lutfen iki adet sayı girin");

        int c,b;
        b= scanner.nextInt();
         c= scanner.nextInt();
        double sonuc;
        


        switch (a) {
                case 1:
                sonuc=c+b;
                System.err.println(+c+"+"+b+" ="+sonuc);
                break;

                case 2:
                sonuc=c-b;
                System.err.println(+c+"-"+b+" ="+sonuc);
                break;    

                case 3:
                sonuc=c*b;
                System.err.println(+c+ "*" + b+"="+sonuc);
                break;


                case 4:
                sonuc=c/b;
                System.err.println(+a+"a/b"+b+" ="+sonuc);
                break;
        
            default:
            System.err.println("gecersiz işlem girdiniz");
                break;
        }
        
         

        

    }
    
}