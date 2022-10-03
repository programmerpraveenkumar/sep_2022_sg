public class ArrayDeclarationCity {
    //collections.
    public static void main(String[] args) {
        City city1 = new City();
        city1.setName("city1");
        city1.setPeopleCount(4545);

        City city2 = new City();
        city2.setName("city2");
        city2.setPeopleCount(454547);

        City[] cityList = {city1,city2};//declare the array in java

        for(City city:cityList){
            System.out.println(city.getName()+" "+city.getPeopleCount());
        }
        char a = 'a';



    }
}
