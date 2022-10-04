package CollectionSample;

import java.util.ArrayList;

/*
    collection is generics.
   COllection data type has to be mentioned with diamond operator <>
   collection will accept oly object or wrapper classes.cant accept primitive data type(int,long,boolean,float,double)
   Ex wrapper Classes:Integer,Long,Float,Double,Boolean,Short



 */
public class ArrayListPojo {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();//will accept ony the stringnameList.add("person1");//0

        Person person1 = new Person();
        person1.setAge(45);
        person1.setName("person1");


        Person person2 = new Person();
        person2.setAge(15);
        person2.setName("person2");

        personList.add(person1);//adding the object to arraylist.
        personList.add(person2);

        for(Person person:personList){
            System.out.println(person.getAge()+" "+person.getName());
        }


    }
}
