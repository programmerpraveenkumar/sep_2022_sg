package CollectionSample.MapSample;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListMap {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String >> obj = new ArrayList<HashMap<String ,String>>();

        HashMap<String,String > h1 = new HashMap<String ,String >();
        h1.put("first_name","firstname1");
        h1.put("last_name","lastname1");
        h1.put("address","address1");

        HashMap<String,String > h2 = new HashMap<String ,String >();
        h2.put("first_name","firstname2");
        h2.put("last_name","lastname2");
        h2.put("address","address2");

        HashMap<String,String > h3 = new HashMap<String ,String >();
        h3.put("first_name","firstname3");
        h3.put("last_name","lastname3");
        h3.put("address","address3");

        obj.add(h1);
        obj.add(h2);
        obj.add(h3);
        for(HashMap<String,String > tmpMap:obj){//paretn arraylist
            System.out.println(tmpMap);
            for (String val: tmpMap.values()){//hashmap iteration.
                System.out.println(val);
            }
            System.out.println("-----end---");
        }


    }
}
