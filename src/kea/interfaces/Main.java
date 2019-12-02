package kea.interfaces;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Rectangle  = new Rectangle(2, 4);
        IShape rectangle = new Rectangle(3, 6);
        IShape circle = new Circle(4.5);

        List<IShape> shapelist = new LinkedList<>();
        shapelist.add(rectangle);
        shapelist.add(circle);


        for (IShape s: shapelist) {
            System.out.println(s.getArea() + " :  " + s.getPerimeter());
        }


    }
}