package CollectionSample;

import java.util.ArrayList;
import java.util.Collections;

/*
    collection is generics.
   COllection data type has to be mentioned with diamond operator <>
   collection will accept oly object or wrapper classes.cant accept primitive data type(int,long,boolean,float,double)
   Ex wrapper Classes:Integer,Long,Float,Double,Boolean,Short



 */
public class ArrayListSample1 {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();//will accept only integer.
        numberList.add(45);
        numberList.add(15);
        numberList.add(1);
        numberList.add(5);
        numberList.add(25);
        System.out.println(numberList);//before sort
        Collections.sort(numberList);
        System.out.println(numberList);//after sort

        ArrayList<String> nameList = new ArrayList<String>();//will accept only integer.
        nameList.add("test");
        nameList.add("animal");
        nameList.add("Animal");
        nameList.add("dog");
        nameList.add("cat");
        System.out.println(nameList);
        Collections.sort(nameList);
        System.out.println(nameList);
    }
}
