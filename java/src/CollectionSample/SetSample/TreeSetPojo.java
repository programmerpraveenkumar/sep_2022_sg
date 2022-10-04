package CollectionSample.SetSample;

import CollectionSample.City;

import java.util.TreeSet;

/*
will not allow for duplicates.
will not maintain the insertion order.but data will be in ascending
 */
public class TreeSetPojo {

    public static void main(String[] args) {
       TreeSet<City2> obj = new TreeSet<City2 >();
     City2 city1 = new City2();
     city1.setName("1st city");
     city1.setPeopleCount(45);

     City2 city2 = new City2();
     city2.setName("2nd city");
     city2.setPeopleCount(4);

     City2 city3 = new City2();
     city3.setName("3rd city");
     city3.setPeopleCount(54);

     City2 city4 = new City2();
     city4.setName("4th city");
     city4.setPeopleCount(1);
     obj.add(city1);
     obj.add(city2);
     obj.add(city3);
     obj.add(city4);

for(City2 city:obj){
 System.out.println(city.getName()+" "+city.getPeopleCount());
}


    }
}
