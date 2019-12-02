package kea.fitnessexercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {

    List<Person> personList = new ArrayList<>();
    Scanner myScan = new Scanner(System.in);  // Create a Scanner object

    public void addNewPerson() {
        System.out.println("Enter name of the person");
        while (myScan.hasNextLine()) {
            //personList.add(myScan.next());

            System.out.println("Enter the person's CPR");
        //   if () {

            }
            System.out.println("The person has been added to the system!");
        }



        public void showPerson() {
            personList.add(new Member("Claus", 21212, true));
            personList.add(new Instructor("Anna", 34343));

            for (Person p : personList) {

                System.out.println(p.getName()); // instance of Person

                if (p instanceof Member){
                    System.out.println(((Member)p).isBasic());
                } else if (p instanceof Instructor){
                    System.out.println(( (Instructor) p).getHours());
                }
            }
        // Hvilken er bedst???

            // transpose in-place
        /*for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.len   gth; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }*/
            System.out.println(Arrays.toString(personList.toArray()));
            System.out.print(personList);//toString() is easy and good enough for debugging.
        }

        public void exitProgram(){
            System.exit(0);
        }
    }