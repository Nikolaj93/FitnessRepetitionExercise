package kea.crudExercise;

import java.util.List;

public interface ICrud {

    public void create(Person p);
    public Person read(String first, String last);
    public void update(Person p);
    public void delete(Person p);

    boolean read();
}
