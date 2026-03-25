import java.util.Scanner;

public class o1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen factorialını almak istediniz sayiyi girin");

        int n,factorial=1,i=1;
        n= scanner.nextInt();
        
       
        while(i<=n){

          
          factorial=factorial*i;
          System.out.println(" factorial" +i+":"+ factorial);
          i++;
        }



    }
    
}
