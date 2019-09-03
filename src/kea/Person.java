package kea;

public class Person {

    private String name;
    private long cpr;

    public Person(String name, long cpr) {
        this.name = name;
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCpr() {
        return cpr;
    }

    public void setCpr(long cpr) {
        // identificer at det er her der skal være kode
        this.cpr = cpr;

    }
}
