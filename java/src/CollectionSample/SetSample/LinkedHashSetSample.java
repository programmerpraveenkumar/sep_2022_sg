package CollectionSample.SetSample;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
will not allow for duplicates.
will  maintain the insertion order.
 */
public class LinkedHashSetSample {

    public static void main(String[] args) {
        LinkedHashSet<String> obj = new LinkedHashSet<String >();
        obj.add("test");
        obj.add("first");
        obj.add("last");
        obj.add("test");//duplicate will be ignore.
        System.out.println(obj);
        for(String tmp:obj){
            System.out.println(tmp);
        }

        LinkedHashSet<Integer> objInt = new LinkedHashSet<Integer >();
        objInt.add(1);
        objInt.add(2);
        objInt.add(12);
        objInt.add(19);
        objInt.add(2);//will be ignore.
        System.out.println(objInt);

    }
}
