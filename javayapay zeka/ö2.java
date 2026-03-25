import java.util.Scanner;
public class ö2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        /* kullanıcının girdigi sayi asalmı degilmi */

        int n,a=0;
        System.out.println("lutfen bir sayi girin");

        n= scanner.nextInt();

        if(n==1 || n==0){
            System.out.println("asal degil");

        }
        else if(n==2){
        
        System.out.println("asaldir");}


        else{

            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    System.out.println("asal degil");
                    a=1;
                    break;
                }
                
            }
            if(a==0){
                System.out.println("asaldir");
            }
        } 
        
        
    }
    
}
