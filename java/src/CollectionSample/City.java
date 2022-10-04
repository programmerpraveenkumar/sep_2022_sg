package CollectionSample;

public class City implements Comparable<City> {
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

        int peopleCount;
        String name;

        @Override
        public int compareTo(City o) {
            System.out.println("passing.."+o.getName()+"-"+o.getPeopleCount()+" --"+this.getName()+"-"+this.getPeopleCount());
            return Integer.compare(this.getPeopleCount(),o.getPeopleCount());
        }
}
