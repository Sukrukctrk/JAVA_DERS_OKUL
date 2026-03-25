public class ö10_test {
    public static void main(String[] args) {
        ö10 bilgisayar=new ö10();

        bilgisayar.setram("18 gb");
        System.out.println("ram :"+bilgisayar.getram());

        bilgisayar.setmodel("Asus");
        System.out.println("model :"+bilgisayar.getmodel());

        bilgisayar.setekran("114HZ");
        System.out.println("ekran kartı :"+bilgisayar.getekran());


        bilgisayar.setSSd("512GB");
        System.out.println("SSD :"+bilgisayar.getSSD());
        
    }
}
