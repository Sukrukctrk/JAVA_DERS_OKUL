import java.util.Scanner;

public class ö3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int bakiye=3500,secim,yat,cek;
         
        System.out.println("1. para yatırma");
        System.out.println("2. para çekme");
        System.out.println("3. bakiye sorgulama ");
        System.out.println("4. çıkış");

        System.out.println("lutfen yaomak istediniz işlemin numarsını girin :(1/2/3/4)");
        secim = scanner.nextInt();


        switch (secim) {
            case 1:
            System.err.println("yatırmak istediniz tutarı secin");
            yat= scanner.nextInt();
            bakiye=bakiye+yat;
            System.out.println(+yat+" tl basarıyla yatırılmıstır");
                break;
        
            case 2:
            System.err.println("çekmek istediniz tutarı secin");
            cek= scanner.nextInt();

            if(bakiye>=cek){
            bakiye=bakiye-cek;
            System.out.println(+cek+" tl basarıyla cekilmistir");}

            else{
                System.out.println("bu kaadar paranız yok");
            }


            break;    
                
            case 3:
            
            System.out.println(+bakiye+" tl bulunmaktadır");
                break;

            case 4:
            System.err.println("cıkılıyor ");

                break;    
            default:
            System.out.println("gecersiz islem girdiniz");
                break;
        }
        
    }
    
}
