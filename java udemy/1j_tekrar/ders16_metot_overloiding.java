public class ders16_metot_overloiding {
    

    public static void toplama(String a,String b){
        System.out.println(a +" "+b);
    }
    
    public static void toplama(int a,int b,int c){
        System.out.println((+a+b+c));
    }

    public static void toplama(int a,int b){
        System.out.println((+a+b));


    }
    public static void main(String[] args) {
        
       
      toplama(1,2,3);
      toplama(3, 5);
      toplama("sukru", "kocaturk");

      // bu şekilde bir fonksiyonu birden farklı şekilde tanımlayabiliyoruz



    }
}
