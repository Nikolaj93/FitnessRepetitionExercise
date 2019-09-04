package kea;

import java.util.Scanner;

public class Menu {
    Controller cont = new Controller();
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    private void show(){
        System.out.println("Welcome to the menu!");
        System.out.println("1. Add New Person");
        System.out.println("2. Show Persons");
        System.out.println("9. Exit Program");
    }
    public void runMenu(){
        show();
        String input = myObj.nextLine();

        switch (input){
            case "1":
                cont.addNewPerson();
                break;

            case "2":
                cont.showPerson();
                break;

            case "3":
                cont.exitProgram();
                break;

            default:
                System.out.println("Goodbye!");
                System.out.println("\n");
                break;
        }
    }
}
