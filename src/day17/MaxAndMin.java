package day17;

import java.util.Scanner;

/*
    write a program that asks user to enter 5 numbers and returns the biggest and smallest numbers from those 5
    1
    Ask a user:
    Tell if it is biggest or smallest.


    2
    Ask a user:
    Tell if it is biggest or smallest.

    3
    Ask a user:
    Tell if it is biggest or smallest.
 */
public class MaxAndMin {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.print("Hey, how many numbers do you want to compare: ");
        int countOfNUm = key.nextInt(); // 8
        int cycle = 1;
        int userNum = 0;

        int biggest = -2147483648;
        int smallest = 2147483647;

//        2147483647
//        -2147483648
        while (cycle <= countOfNUm) {
            System.out.print("Please, enter the number " + cycle + ": ");
            userNum = key.nextInt();

            if (userNum > biggest){
                biggest = userNum;
            }

            if (userNum < smallest){
                smallest = userNum;
            }

            cycle++;
        }

        System.out.println("Biggest: " + biggest);
        System.out.println("Smallest: " + smallest);

    }

    }
