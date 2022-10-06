package CollectionSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortSample {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<Person>();//will accept ony the stringnameList.add("person1");//0

        Person person1 = new Person();
        person1.setAge(45);
        person1.setName("john");

        Collections.sort(personList, new AgeComparator() );
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(),p2.getAge());
            }
        });

    }
}
/*
    add(5,10)->(a,b)=>a+b


 */
