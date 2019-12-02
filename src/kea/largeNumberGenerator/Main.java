package kea.largeNumberGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 1; i < 100; i++) numberList.add(i % 1000000);
        Collections.shuffle(numberList);
        System.out.println(numberList);
    }
}