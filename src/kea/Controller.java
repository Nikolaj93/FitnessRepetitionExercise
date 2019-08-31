package kea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    public void addNewMember(){

    }

    public void showMembers(){
    }

    public void addNewEmployee(){

    }

    public void showEmployees(){
        // Hvilken er bedst???
        List<Employees> employees = new ArrayList<>();
        employees.add(new Employees("Claus ", "221175-1011 ", "Instructor ", "37 ", "23000 ", "5 "));
        System.out.println(Arrays.toString(employees.toArray()));
        System.out.print(employees);//toString() is easy and good enough for debugging.
    }
}
