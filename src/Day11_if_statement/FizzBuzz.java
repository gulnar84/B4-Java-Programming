package Day11_if_statement;

import java.util.Scanner;

public class FizzBuzz {
    /*

   you will have a number

   if the number is divisible by 3 print -> Fizz
   if the number is divisible by 5 print -> Buzz
   if the number is divisible by both 3 and 5 -> FizzBuzz
   if the number is not divisible by any of those, print just the number

 */
    //option 1
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter number; ");
        int number = key.nextInt();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(number);
        }
        //option 2
        if (number % 3 == 0 && number % 5 != 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0 && number % 3 != 0) {
            System.out.println("Buzz");
        } else if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else {
            System.out.println(number);
        }
    }
}