package CollectionSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    collection is generics.
   COllection data type has to be mentioned with diamond operator <>
   collection will accept oly object or wrapper classes.cant accept primitive data type(int,long,boolean,float,double)
   Ex wrapper Classes:Integer,Long,Float,Double,Boolean,Short



 */
public class ArrayListPojoSort {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();//will accept ony the stringnameList.add("person1");//0

        Person person1 = new Person();
        person1.setAge(45);
        person1.setName("john");


        Person person2 = new Person();
        person2.setAge(15);
        person2.setName("abc");

        Person person3 = new Person();
        person3.setAge(5);
        person3.setName("yuy");

        personList.add(person1);//adding the object to arraylist.
        personList.add(person2);
        personList.add(person3);
        //Comprator


        for(Person person:personList){
            System.out.println(person.getAge()+" "+person.getName());
        }
        System.out.println("---after sorting---");
        Collections.sort(personList,new AgeComparator());
        for(Person person:personList){
            System.out.println(person.getAge()+" "+person.getName());
        }
        System.out.println("---Name  sorting---");
//        Collections.sort(personList,new NameComparator());
        for(Person person:personList){
            System.out.println(person.getAge()+" "+person.getName());
        }


    }
}

class AgeComparator implements Comparator<Person>{
/*
return 1 -> 1st args is the greater than 2nd
return -1 -> 2nd args is the greater than 1st
return 0 -> 2nd and 1st are same
 */
    @Override
    public int compare(Person p1, Person p2) {
        //Long.Compare();
        return Integer.compare(p1.getAge(),p2.getAge());
//       if(p1.getAge() > p2.getAge()){
//           return 1;
//       }else if(p1.getAge() < p2.getAge()){
//            return -1;
//        }else{
//           return 0;
//       }
    }
}

class NameComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2) {
      //  p1.getName().compareTo(p2.getName());
        return p1.getName().compareToIgnoreCase(p2.getName());//
        //if(p1.getName().e)
    }
}