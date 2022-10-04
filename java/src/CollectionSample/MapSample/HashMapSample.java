package CollectionSample.MapSample;

import java.util.HashMap;
/*
hashmap will not maintain the insertion order.
 */
public class HashMapSample {
    public static void main(String[] args) {
        HashMap<Integer,String> obj1 = new HashMap<Integer,String>();//key is int and value is string
        obj1.put(1,"first person");
        obj1.put(10,"second person");



        HashMap<String,String> obj2 = new HashMap<String,String>();//key is string and value is string
        obj2.put("name","first person");
        obj2.put("last_name","second");
        obj2.put("email","test email");
        obj2.put("email1","test emailasdf");

        obj2.put("last_name","second person updated");//as the key is duplicate ,value will be override
        System.out.println(obj2);
        System.out.println(obj2.size());
        System.out.println(obj2.get("last_name"));//value access using the key
        obj2.putIfAbsent("email","new email");//will add oly when the key is not exist.
        obj2.remove("last_name");//remove based on the key
        //obj2.clear();//clear all the element from the hashmap
        System.out.println(obj2.size());
        //iteration based on values.
        System.out.println("--value iteration---");
        for(String tmp:obj2.values()){
            System.out.println(tmp);
        }

        System.out.println("--key iteration---");
        for(String tmp:obj2.keySet()){
            System.out.println(tmp+" -- "+obj2.get(tmp));
        }
        System.out.println(obj2.containsKey("address"));
        System.out.println(obj2.containsKey("email"));
        System.out.println(obj2.containsValue("second"));//TODO return true;..
        System.out.println(obj2.containsValue("no person"));


        HashMap<String,Long> obj3 = new HashMap<String,Long>();//key is string and value is long
    }
}
