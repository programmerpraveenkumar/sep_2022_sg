package CollectionSample.MapSample;

import CollectionSample.City;

import java.util.HashMap;

public class HashMapSamplePojo {
    public static void main(String[] args) {
        HashMap<Integer, City> obj1 = new HashMap<Integer,City>();//key is int and value is string
        City city1 = new City(4545,"test1");
        City city2 = new City(4545,"test1");

        obj1.put(1,city1);
        obj1.put(2,city2);
        obj1.put(3,new City(45,"test3"));

        for(City city:obj1.values()){
            System.out.println(city.getPeopleCount()+" "+city.getName());
        }

        HashMap<String, City> obj2 = new HashMap<String,City>();

        obj2.put("city1",city1);
        obj2.put("city2",city2);
        obj2.put("city3",new City(45,"test3"));
        obj2.get("city3");

    }
}
