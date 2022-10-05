package CollectionSample;

public class City implements Comparable<City> {
    int peopleCount;
    String name;
    public City(){

    }
    public City(int peopleCount,String name){
        this.peopleCount = peopleCount;
        this.name = name;
    }
    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
            this.peopleCount = peopleCount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }



        @Override
        public int compareTo(City o) {
            //System.out.println("passing.."+o.getName()+"-"+o.getPeopleCount()+" --"+this.getName()+"-"+this.getPeopleCount());
            return Integer.compare(this.getPeopleCount(),o.getPeopleCount());
        }
}
