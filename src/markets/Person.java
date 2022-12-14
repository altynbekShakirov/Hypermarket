package markets;


public class Person {
    private String  name;
    private int pricePerson;

    public Person() {
    }

    public Person(String name, int pricePerson) {
        this.name = name;
        this.pricePerson = pricePerson;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name: " + name + '\n' +
                "pricePerson:" + pricePerson+"\n" ;
    }

    public int getPricePerson() {
        return pricePerson;
    }

    public void setPricePerson(int pricePerson) {
        this.pricePerson = pricePerson;
    }

    public void setName(String name) {
        this.name = name;
    }
}
