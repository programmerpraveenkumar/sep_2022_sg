package CollectionSample.SetSample;

public class City2 implements Comparable<City2> {
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
    public int compareTo(City2 o) {
        return Integer.compare(this.getPeopleCount(),o.getPeopleCount());
    }
}
