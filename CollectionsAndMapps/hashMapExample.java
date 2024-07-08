package CollectionsAndMapps;

import java.util.HashMap;

public class hashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> list = new HashMap<>();
        list.put("Apple" , 1);
        System.out.println(list.get("Apple"));
        list.put("apple" , 2);
        System.out.println(list.containsKey("apple"));


        //in this merge function what is doing is if the key exist then it will add the value to it if not then create new key and set the value
        list.merge("apple", 1,Integer::sum);
        list.merge("apple", 1,Integer::sum);

        list.merge("Mango", 3,Integer::sum);

        System.out.println(list);


    }
}
