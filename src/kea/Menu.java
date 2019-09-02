package kea;

import java.util.Scanner;

public class Menu {
    Controller cont = new Controller();
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    private void show(){
        System.out.println("Welcome to the menu!");
        System.out.println("1. Add New Member");
        System.out.println("2. Show Members");
        System.out.println("3. Add New Employee");
        System.out.println("4. Show Employees");
    }
    public void runMenu(){
        show();
        String input = myObj.nextLine();

        switch (input){
            case "1":
                cont.addNewMember();
                break;

            case "2":
                cont.showMembers();
                System.out.println("\n");
                break;

            case "3":
                cont.addNewEmployee();
                System.out.println("\n");
                break;

            case "4":
                //System.out.print("\033[H\033[2J");
                cont.showEmployees();
                System.out.println("\n");
                break;

            default:
                System.out.println("??");
                System.out.println("\n");
                break;
        }
    }
}
