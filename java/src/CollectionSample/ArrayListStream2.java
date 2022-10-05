package CollectionSample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
    collection is generics.
   COllection data type has to be mentioned with diamond operator <>
   collection will accept oly object or wrapper classes.cant accept primitive data type(int,long,boolean,float,double)
   Ex wrapper Classes:Integer,Long,Float,Double,Boolean,Short



 */
public class ArrayListStream2 {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();//will accept ony the stringnameList.add("person1");//0

        Person person1 = new Person();
        person1.setAge(45);
        person1.setName("person1");


        Person person2 = new Person();
        person2.setAge(15);
        person2.setName("person2");

        Person person3 = new Person();
        person3.setAge(5);
        person3.setName("person3");

        Person person4 = new Person();
        person4.setAge(10);
        person4.setName("person4");

        personList.add(person1);//adding the object to arraylist.
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);


        personList.forEach((obj)->{
            System.out.println(obj.getAge()+" "+obj.getName());
        });

      List<Integer> ageList = personList.stream().map((obj)->obj.getAge()+5).collect(Collectors.toList());
        List<Integer> ageList1 = personList.stream().filter((obj)->obj.getAge()<=10).map((obj)->obj.getAge()+5).collect(Collectors.toList());

        System.out.println(ageList1);




    }
}
