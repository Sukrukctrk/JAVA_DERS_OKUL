public class ders2_floatdouble {
    
    public static void main(String[] args) {
        /*
         * double 64 bit yani 8 byte yer tutar
         * fkoat 32 bit yani 8 byte yertutar
         * 
         */
        /* 
         double a=5.0;
         double b=5.8;
         double c=3.24d; // d doublenin d si
         float d= 5f;
         float e= (float)5.0; // yoksa hata verir çünkü 5.0 gibi degerler double veri tipinde tanımlı
         float f=8.9f;
         */


         int a=22/7;
         float b= 22f/7f;
         double c= 22d/7d;


         System.out.println("a "+a);
         System.out.println("b "+b);
         System.out.println("c "+c);


         int i=5;
         float j=i;

         System.out.println(j);

         double k=3.45;
         float z=(float)k;// hata verir
    }
}
