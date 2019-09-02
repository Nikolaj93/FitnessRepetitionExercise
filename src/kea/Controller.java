package kea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {

    List<Members> members = new ArrayList<>();
    List<Employees> employees = new ArrayList<>();
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    public void addNewMember(){
        System.out.println("Enter name of member");
        while (myObj.hasNextLine()) {
            employees.add(myObj.nextLine());

            System.out.println("Enter member CPR");

            System.out.println("Enter membership type");

            System.out.println("Enter membership fee");

            System.out.println("The member has been added to the system!");
        }
    }

    public void showMembers(){
    }

    public void addNewEmployee() {
        while (myObj.hasNextLine()) {
            employees.add(myObj.nextLine());

            System.out.println("Enter name of employee");
            String employeeName = myObj.nextLine();

            System.out.println("Enter employee CPR");
            String employeeCPR = myObj.nextLine();

            System.out.println("Enter Administration personnel or Instructor");
            String employeeType = myObj.nextLine();

            System.out.println("Enter employee hours");

            System.out.println("Enter employee salary");

            System.out.println("Enter employee vacation");

            System.out.println("The employee has been added to the system!");
        }
    }

        public void showEmployees() {
            // Hvilken er bedst???

            employees.add(new Employees("Claus ", "221175-1011 ", "Administration personnel ", "37 ", "23000 ", "5 \n"));
            employees.add(new Employees("Tove ", "011080-1014 ", "Instructor ", "20 ", "9120 ", " \n"));
            employees.add(new Employees("Anna ", "011080-1012 ", "Administration personnel ", "37 ", "23000 ", "5 \n"));
            employees.add(new Employees("Henning ", "011080-1014 ", "Instructor ", "15 ", "6840 ", " \n"));
            // transpose in-place
        /*for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.len   gth; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }*/
            System.out.println(Arrays.toString(employees.toArray()));
            System.out.print(employees);//toString() is easy and good enough for debugging.
        }
    }
