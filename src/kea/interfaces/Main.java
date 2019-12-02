package kea.interfaces;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Rectangle  = new Rectangle(2, 4);
        IShape rectangle = new Rectangle(3, 6);
        IShape circle = new Circle(4.5);

        List<IShape> shapeList = new LinkedList<>();
        shapeList.add(rectangle);
        shapeList.add(circle);


        for (IShape s: shapeList) {
            System.out.println(s.getArea() + " :  " + s.getPerimeter());
        }


    }
}