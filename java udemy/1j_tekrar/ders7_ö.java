import java.util.Scanner;

public class ders7_ö {
    public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);

    // aracın km de ne kadar yaktını ve bu aracın kac kilometre gittini alalım sonra tutarı bastıralım
    double yakıt,toplam;
    int km;


    System.out.println("arrabayla kac km yol gittiniz");
    km= scanner.nextInt();

    System.out.println("km basına arabanız ne kadar yakıyor");
    yakıt=scanner.nextDouble();


     toplam=yakıt*km;
     System.out.println("toplam odemeniz gereken tutar "+toplam);

    }
}
