package kea.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

    //  List<String> stringList = new ArrayList();
    //  stringList.add("Claus");
    //  Object s = stringList.get(0);
    //  System.out.println(s);

    //  stringList.add(22);
    //  Object i = stringList.get(1);

        Box<String> box = new Box<>();

        box.set("Claus");
        System.out.println((box.get()));


    }
}
