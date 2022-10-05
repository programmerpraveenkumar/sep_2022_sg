package CollectionSample;

import java.util.ArrayList;
import java.util.Collections;

/*
    collection is generics.
   COllection data type has to be mentioned with diamond operator <>
   collection will accept oly object or wrapper classes.cant accept primitive data type(int,long,boolean,float,double)
   Ex wrapper Classes:Integer,Long,Float,Double,Boolean,Short



 */
public class ArrayListPojoComparable {
    public static void main(String[] args) {
        ArrayList<City> cityList = new ArrayList<City>();//will accept ony the stringnameList.add("person1");//0

        City city1 = new City();
        city1.setName("1st city");
        city1.setPeopleCount(45);

        City city2 = new City();
        city2.setName("2nd city");
        city2.setPeopleCount(4);

        City city3 = new City();
        city3.setName("3rd city");
        city3.setPeopleCount(54);

        City city4 = new City();
        city4.setName("4th city");
        city4.setPeopleCount(1);

//        City city5 = new City();
//        city4.setName("3rd city");
//        city4.setPeopleCount(1);


        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);
        cityList.add(city4);
        ArrayList<City> cityList1 = cityList;
        Collections.sort(cityList);

        for(City city :cityList){
            System.out.println(city.getName()+" "+city.getPeopleCount());
        }


    }
}
