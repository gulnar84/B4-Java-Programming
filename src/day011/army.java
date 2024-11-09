package day011;

import java.util.Scanner;

public class army {
    public static void main(String[] args) {
        boolean isCitizen;
        boolean isResident;
        boolean hasDiploma;
        int age;
        Scanner key = new Scanner(System.in);

        System.out.println(" Welcome to Army station");
        System.out.println("Please answer the following question to check eligibility\n");
        System.out.println("\tAre you citizen(true/false)");
        isCitizen = key.nextBoolean();
        System.out.println("\tAre you resident(true/false)");
        isResident = key.nextBoolean();
        System.out.println("\tDo you have a high school diploma");
        hasDiploma = key.nextBoolean();
        System.out.println("\tHow old are you");
        age = key.nextInt();

        if (isCitizen || isResident && hasDiploma && 18 <= age && age <= 35) {
            System.out.println("Test");
            System.out.println("You are eligible");
        } else {
            if (!isCitizen || !isResident) {
                System.out.println("You must be a citizen or a resident");
            }
            }  if (!hasDiploma){
                System.out.println("You must have a high school diploma");
            }


        if ( age<18|| age>35) {
            System.out.println("\t\tYou must be between 18 to 35 years old");

        }
        }
    }
