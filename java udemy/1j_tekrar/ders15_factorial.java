import java.util.Scanner;



public class ders15_factorial {


    public static int factoriall(int a){

        int i=1;
        int sonuc=1;
        if(a==0 ){
            return 1;
        
        }
        
        else{
            
            while (i<=a) {
                sonuc= i*sonuc;
                i++;
            }
            return sonuc;
        }
        
        
        }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen factorial almak istediniz sayıyı girin");
        int a= scanner.nextInt();

        System.out.println(+a+"! = " +factoriall(a));
        
        
    }
    
}
