package CollectionSample.MapSample;

import java.util.HashMap;
import java.util.LinkedHashMap;
/*
linkedhashmap  maintains the insertion order.
 */
public class LinkedHashMapSample {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> obj1 = new LinkedHashMap<Integer,String>();//key is int and value is string
        obj1.put(1,"first person");
        obj1.put(10,"second person");
        for(int key:obj1.keySet()){
            System.out.println(key+" "+obj1.get(key));
        }

        for(String val:obj1.values()){
            System.out.println(val);
        }


    }
}
