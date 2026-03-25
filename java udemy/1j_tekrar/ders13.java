import java.util.Scanner;
public class ders13 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int a,b;
        System.out.println("kaç tl yatırcaksınız :");
        a= scanner.nextInt();
        System.out.println("kac yıllıgına yatırıyorsunuz:");
        b=scanner.nextInt();


        int i=0;
        double para=0.0;

        while (i<b) {
              
            para = a +  a*(0.06);
            i++;
            
            
        }

        System.out.println("paranız"+para);
    } 
    
}
