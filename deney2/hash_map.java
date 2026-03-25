import java.util.HashMap;

public class hash_map {

    public static void main(String[] args) {
        HashMap <String,Integer> m= new HashMap<String,Integer>();

        m.put("BOLU", 14);
        m.put("Ankara", 06);
        m.put("çorum", 19);
        m.put("İstanbul", 34);

        for (String i :m.keySet() ) {

            System.out.println(" key : "+i+" volue : "+m.get(i));
            
        }
        
    }
    
}
