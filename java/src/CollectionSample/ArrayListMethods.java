package CollectionSample;

import java.util.ArrayList;

/*
    collection is generics.
   COllection data type has to be mentioned with diamond operator <>
   collection will accept oly object or wrapper classes.cant accept primitive data type(int,long,boolean,float,double)
   Ex wrapper Classes:Integer,Long,Float,Double,Boolean,Short



 */
public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();//will accept ony the string
        nameList.add("person1");//0
        nameList.add("person2");//1
        nameList.add("person3");//2
        nameList.add("person1");//3 position.
        System.out.println(nameList);
        nameList.remove(1);//remove the data in the index of 1.
        System.out.println(nameList);
        System.out.println(nameList.contains("person1"));//to check whether element is exist or not.
        System.out.println(nameList.indexOf("person34"));//to get the position.if exist will give index else -1.
     //   int index = nameList.indexOf("person34");
//        if(index >=0){
//
//        }else {
//            /no
//        }


        


    }
}
