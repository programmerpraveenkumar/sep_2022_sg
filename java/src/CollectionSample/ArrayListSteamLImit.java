package CollectionSample;

import java.util.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

/*
    collection is generics.
   COllection data type has to be mentioned with diamond operator <>
   collection will accept oly object or wrapper classes.cant accept primitive data type(int,long,boolean,float,double)
   Ex wrapper Classes:Integer,Long,Float,Double,Boolean,Short



 */
public class ArrayListSteamLImit {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();//will accept only integer.
        numberList.add(45);
        numberList.add(15);
        numberList.add(1);
        numberList.add(5);
        numberList.add(25);
        numberList.add(105);
        numberList.add(95);

        System.out.println(numberList);//before sort
        Collections.sort(numberList);
        System.out.println(numberList);//after sort
        numberList.stream().limit(3);
       List<Integer> numberList1 = numberList.stream().limit(3).collect(Collectors.toList());
        List<Integer> numberList2 = numberList.stream().filter((obj)->obj<=50).limit(2).collect(Collectors.toList());
        System.out.println(numberList1);
        System.out.println(numberList2);


    }
}
