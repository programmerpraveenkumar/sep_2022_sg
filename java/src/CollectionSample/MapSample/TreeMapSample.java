package CollectionSample.MapSample;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/*
TreeMap will not  maintain the insertion order.but sort will happen on key.
 */
public class TreeMapSample {
    public static void main(String[] args) {
        TreeMap<Integer,String> obj1 = new TreeMap<Integer,String>();//key is int and value is string
        obj1.put(10,"second person");
        obj1.put(1,"first person");

        System.out.println(obj1);
        for(int key:obj1.keySet()){
            System.out.println(key+" "+obj1.get(key));
        }

        for(String val:obj1.values()){
            System.out.println(val);
        }


    }
}
