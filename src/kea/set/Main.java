package kea.set;

import kea.fitnessexercises.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> hashStudent = new HashSet<Student>();
        hashStudent.add(new Student(1001, "Per"));
        hashStudent.add(new Student(1002, "Poul"));
        hashStudent.add(new Student(1003, "Peter"));
        hashStudent.add(new Student(1004, "Pia"));
        hashStudent.add(new Student(1005, "Petra"));
        hashStudent.add(new Student(1006, "Pancake"));
        hashStudent.remove("Pancake");

        Iterator<Student> iterator = hashStudent.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        while(iterator.hasNext()) {
            Student setElement = iterator.next();
            if(setElement == hashStudent) {
                iterator.remove();
            }
        }
    }
}