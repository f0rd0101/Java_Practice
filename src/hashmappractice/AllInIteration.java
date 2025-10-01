// HasMap Iteration1


package hashmappractice;
import java.util.HashMap;
import java.util.Map;
public class AllInIteration {
    public static void main(String[] args){
        HashMap<String,Integer> shop = new HashMap<>();
        shop.put("apple",24);
        shop.put("banana",33);
        shop.put("dragon fruit",13);
        shop.put("orange", 40);

        System.out.println(shop);
        int i = 0;
        for(Map.Entry<String,Integer> element : shop.entrySet()){
            i++;
            System.out.println(i + "." + " " + element.getKey() + " costs " + element.getValue() + " $");

        }
    }

}
