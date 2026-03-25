public class ders22_test1 {

 public static void main(String[] args) {

   /*  ders22_Account Account =new ders22_Account();

    Account.setisim("sukru");
    Account.setgamail("kocaturk sukru");
    set  fonksiyonu ile bu şekilde çağiriyoruz
*/
    
ders22_Account account =new ders22_Account("1234567", 1000, "sukru", "kocaturk");

account.para_yatır(500);
// constructer yapıcı metod
 }
    
}
