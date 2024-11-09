package day011;

import java.util.Scanner;

public class FieldTrip {
    public static void main(String[] args) {
        int grade;
        String teacher;
        String location;
        int numOfGroup;
        Scanner key = new Scanner(System.in);
        System.out.println("what is grade you want to get a field trip info;");
        grade = key.nextInt();
        //grade from 1 to 6 ----Mr.Nadir|Apple Orchard|3
        //all the other grade---Mr.Benjamin|Fire Works|10
        if (grade >= 1 && grade <= 6) {
            teacher = "Mr.Nadir";
            location = "Apple Orchard";
            numOfGroup = 3;
            if (grade == 1) {
                teacher = "Ms.Jessica";
                location = "Zoo";
                numOfGroup = 4;
            } else if (grade == 3) {
                teacher = "Tom";
                location = "Museum";
                numOfGroup = 7;
            } else if (grade == 4) {
                teacher = "Ms.Jerry";
                location = "Aquarium";
                numOfGroup = 9;
            } else if (grade == 5) {
                teacher = "Ms.Winnie";
                location = "disneyLand";
                numOfGroup = 2;
            }
        } else
            teacher = "Ms Pooh";
        location = "Concert";
        numOfGroup = 3;
    }



           //  else {
             //   teacher = "Mr.Benjamin";
              //  location = "Fire Works";
            //    numOfGroup = 10;
               // System.out.println("");
            }

