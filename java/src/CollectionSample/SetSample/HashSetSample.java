package CollectionSample.SetSample;

import java.util.HashSet;
/*
will not allow for duplicates.
will not maintain the insertion order.it uses hashcode to store the data.so based on the hashcode it list data.
 */
public class HashSetSample {

    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<String >();
        obj.add("test");
        obj.add("first");
        obj.add("last");
        obj.add("test");//duplicate will be ignore.
        System.out.println(obj);
        for(String tmp:obj){
            System.out.println(tmp);
        }

        HashSet<Integer> objInt = new HashSet<Integer >();
        objInt.add(1);
        objInt.add(2);
        objInt.add(12);
        objInt.add(19);
        objInt.add(2);//will be ignore.
        System.out.println(objInt);

    }
}
