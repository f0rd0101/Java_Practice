package hashmappractice;

import java.util.HashMap;


public class ValueAndKeysIteration {
    public static void main(String[] args){
        HashMap<String,Integer> shop = new HashMap<>();
        shop.put("apple",24);
        shop.put("banana",33);
        shop.put("dragon fruit",13);
        shop.put("orange", 40);
        //values
        int i = 0;
        for(Integer element : shop.values()){
            i++;
            System.out.println(i + ". " + element);

        }
        //key
        int k = 0;
        for(String elem : shop.keySet()){
            k++;
            System.out.println(k + ". " + elem);
        }



    }
}
