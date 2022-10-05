package CollectionSample.MapSample;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapWithArrayList {

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> obj = new HashMap<String,ArrayList<String>>();

        ArrayList<String> a1 = new ArrayList<>();
        a1.add("1-first");
        a1.add("1-second");
        a1.add("1-third");



        ArrayList<String> a2 = new ArrayList<>();
        a2.add("2-first");
        a2.add("2-second");
        a2.add("2-third");

        ArrayList<String> a3 = new ArrayList<>();
        a3.add("3-first");
        a3.add("3-second");
        a3.add("3-third");

        obj.put("a1",a1);//adding arraylist with hashmap
        obj.put("a2",a2);//adding arraylist with hashmap
        obj.put("a3",a3);//adding arraylist with hashmap
        ArrayList<String> tmp1 = obj.get("a1");
        for(String str:tmp1 ){//arraylist from the hashmap
            System.out.println(str);
        }
//        for( ArrayList<String> tmp:obj.values()){
//            System.out.println("---start ---");
//            for(String str:tmp ){//arraylist from the hashmap
//                System.out.println(str);
//            }
//            System.out.println("------");
//        }
        for( String key:obj.keySet()){
            ArrayList<String> tmp =  obj.get(key);
            System.out.println("---start ---"+key);
            for(String str:tmp ){//arraylist from the hashmap
                System.out.println(str);
            }
            System.out.println("------");
        }

    }
}
