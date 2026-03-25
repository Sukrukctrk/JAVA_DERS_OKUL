import java.util.Scanner;

public class ders9 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1, number, kalan;
        
        
        System.out.println("Sayıyı girin:");
        number1 = input.nextInt();

        
        while (true) {

            kalan = number1 % 10; 
            System.out.print(+ kalan);
            number1 = number1 / 10;  
            
            if(number1==0){
                break;
            }
            
        }

       
    }
}
