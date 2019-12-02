package kea.fitnessexercises;

public class Instructor extends Employee {

    private int hours;

    public Instructor(String name, long cpr) {
        super(name, cpr);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
