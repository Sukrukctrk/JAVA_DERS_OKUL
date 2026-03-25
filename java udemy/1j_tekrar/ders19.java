import java.util.Scanner;
public class ders19 {

    public static int çıkarma(int a,int b){

        return a-b;
    }
    public static int toplama(int a,int b){

        return a+b;
    }
    public static int çarpma(int a,int b){

        return a*b;
    }
    public static double bolme(int a,int b){

        return a/b;
    }

    public static int çıkarma(int a,int b,int c){

        return a-b-c;
    }
    public static int toplama(int a,int b,int c){

        return a+b;
    }
    public static int çarpma(int a,int b,int c){

        return a*b*c;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        //overriyding yaparak toplama cikarma bolme ve carpma yapan program

        System.out.println("lutfen yappmak istediniz işlemi seciniz");
        int z = scanner.nextInt();

        if(z==1){

            System.out.println("kac asamali işlem yapmak istedinizi girin 2/3");
            int x= scanner.nextInt();

            if(x==2){
                System.out.println("iki tane sayi girin");
                int a= scanner.nextInt();
                int b= scanner.nextInt();

                System.out.println(+a +"+"+b+"="+toplama(a, b));
            }
            
            else if(x==3){

                System.out.println("3 tane sayı girin");
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                int c= scanner.nextInt();

                System.out.println(+a +"+"+b+"="+toplama(a, b,c));
            }
            else{
                System.out.println("gecersiz işlem girdiniz");
            }


        }
          
        else if(z==2){

            System.out.println("kac asamali işlem yapmak istedinizi girin 2/3");
            int x= scanner.nextInt();

            if(x==2){
                System.out.println("iki tane sayi girin");
                int a= scanner.nextInt();
                int b= scanner.nextInt();

                System.out.println(+a +"-"+b+"="+çıkarma(a, b));
            }
            
            else if(x==3){

                System.out.println("3 tane sayı girin");
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                int c= scanner.nextInt();

                System.out.println(+a +"-"+b+"="+çıkarma(a, b,c));
            }
            else{
                System.out.println("gecersiz işlem girdiniz");
            }
        }
        
        if(z==3){

            System.out.println("kac asamali işlem yapmak istedinizi girin 2/3");
            int x= scanner.nextInt();

            if(x==2){
                System.out.println("iki tane sayi girin");
                int a= scanner.nextInt();
                int b= scanner.nextInt();

                System.out.println(+a +"*"+b+"="+çarpma(a, b));
            }
            
            else if(x==3){

                System.out.println("3 tane sayı girin");
                int a= scanner.nextInt();
                int b= scanner.nextInt();
                int c= scanner.nextInt();

                System.out.println(+a +"*"+b+"="+çarpma(a, b,c));
            }
            else{
                System.out.println("gecersiz işlem girdiniz");
            }


            if(z==4){

               
                
                    System.out.println("iki tane sayi girin");
                    int a= scanner.nextInt();
                    int b= scanner.nextInt();
    
                    System.out.println(+a +"+"+b+"="+bolme(a, b));
                
            }


        }
    }


    }


    

