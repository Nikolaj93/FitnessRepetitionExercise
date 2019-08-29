package kea;

import java.io.Console;
import java.util.Scanner;

public class Menu {
    Controller cont = new Controller();
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    private void show(){
        System.out.println("Welcome to the menu!");
        System.out.println("1. Does one thing");
        System.out.println("2. Does another thing");
        System.out.println("3. Does something completely different");
    }
    public void runMenu(){
        show();
        String input = myObj.nextLine();

        switch (input){
            case "1":
                System.console().flush();
                cont.DoesOneThing();
                break;

            case "2":
                System.console().flush();
                cont.DoesAnotherThing();
                System.out.println("\n");
                break;

            default:
                System.out.println("??");
                System.out.println("\n");
                break;
        }
    }
}
