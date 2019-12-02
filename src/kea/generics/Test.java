package kea.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

    //  List<String> liste= new ArrayList();
    //  liste.add("Claus");
    //  Object s = liste.get(0);
    //  System.out.println(s);

    //  liste.add(22);
    //  Object i = liste.get(1);

        Box<String> box = new Box<>();

        box.set("Claus");
        System.out.println((box.get()));


    }
}
