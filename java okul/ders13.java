public class ders13 {
    public static void main(String[] args) {

    /*%5 faiz saglayan tasarruf hesabına 1000 dolar yatırıyor  a= p(1+r)**n
     *  n yıl
     * p paramız
     * r faiz oranı
     * 
     * 
     */
    
    float a=0.f;
    int n=10, p=1000,r=5;

    int i=0;
    while (i<n) {

        a +=(float) (p*(Math.pow((1+r),10)));

        System.out.println("toplam paranız" + a);
        i++;
        
    }

    

        
    }
}
