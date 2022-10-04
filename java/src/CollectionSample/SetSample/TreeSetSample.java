package CollectionSample.SetSample;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
will not allow for duplicates.
will not maintain the insertion order.but data will be in ascending
 */
public class TreeSetSample {

    public static void main(String[] args) {
       TreeSet<String> obj = new TreeSet<String >();
        obj.add("zebra");
        obj.add("lion");
        obj.add("animal");
        obj.add("cat");
        obj.add("cat");//duplicate will be ignore.
        System.out.println(obj);

        TreeSet<Integer> objInt = new TreeSet<Integer >();
        objInt.add(100);
        objInt.add(1);
        objInt.add(5);
        objInt.add(2);
        objInt.add(3);
        objInt.add(100);
        System.out.println(objInt);





    }
}
