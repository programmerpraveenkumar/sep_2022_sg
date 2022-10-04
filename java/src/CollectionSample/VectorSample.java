package CollectionSample;

import java.util.ArrayList;
import java.util.Vector;

/*
    collection is generics.
   COllection data type has to be mentioned with diamond operator <>
   collection will accept oly object or wrapper classes.cant accept primitive data type(int,long,boolean,float,double)
   Ex wrapper Classes:Integer,Long,Float,Double,Boolean,Short



 */
public class VectorSample {
    public static void main(String[] args) {
        Vector<Integer> numberList = new Vector<Integer>();//will accept only integer.
        numberList.add(45);//adding the value to the arraylist in the position of 0
        numberList.add(15);//adding the value to the arraylist in the position of 1
        System.out.println(numberList.get(1));//to get the value from the arraylist.
        numberList.add(35);//adding the value to the arraylist in the position of 2
        System.out.println(numberList.get(2));//to get the value from the arraylist.
        System.out.println(numberList);//for printing all the data from arraylist.
        for(int tmp:numberList){
            System.out.println(tmp);
        }

        System.out.println("---name list --");



        Vector<String> nameList = new Vector<String>();//will accept ony the string
        nameList.add("person1");//0
        nameList.add("person2");//1
        nameList.add("person3");//2
        nameList.add("person1");//3 position.
        System.out.println(nameList.get(0));//to get the value from the arraylist.
        nameList.add("adding new person");//adding the value to the arraylist in the position of 2
        System.out.println(nameList.get(2));//to get the value from the arraylist.
        System.out.println(nameList);//for printing all the data from arraylist.
        for(String tmp:nameList){
            System.out.println(tmp);
        }



    }
}
