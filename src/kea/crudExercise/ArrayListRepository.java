package kea.crudExercise;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRepository implements ICrud {

    List<Person> personList = new ArrayList<>();


    public void create(Person p) {
        personList.add(p);
    }

    @Override
    public Person read(String first, String last) {

        return new Person("Claus");
    }

    @Override
    public void update(Person p) {

    }

    @Override
    public void delete(Person p) {

    }

    @Override
    public boolean read() {
        return false;
    }
}
