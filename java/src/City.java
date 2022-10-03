//pojo class->Plain object java object.
//@Getter
//@Setter
public class City {
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

    private int peopleCount;
    private String name;

}
