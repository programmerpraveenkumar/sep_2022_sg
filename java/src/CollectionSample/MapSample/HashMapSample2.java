package CollectionSample.MapSample;

import java.util.HashMap;

public class HashMapSample2 {
    public static void main(String[] args) {
        HashMap<Integer,String> obj1 = new HashMap<Integer,String>();//key is int and value is string
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
