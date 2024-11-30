package Day10_IfStatement;

import java.util.Scanner;
/*
    - Place an order
    - Ask the user the enter the product name (String, multiple words)
    - Ask the user to enter the price (double)
    - Ask the user to enter the quantity(int)
    - Ask the user to enter their full name (String, multiple word)
    - Print in the following format:
        "$fullName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."
    Ex:
        Input: "Apples" , 1.5, 5. "Luke"
        Output: Luke, your order for 5 Apples has been places. Your total is 7.5.

 */
public class Order {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("enter the product name");
        String product= keyboard.nextLine();

        System.out.println("enter the price ");
        double price= keyboard.nextDouble();

        System.out.println("enter the quantity");
        int quantity= keyboard.nextInt();
        keyboard.nextLine();
        // If there is any other than nextLine scanner method before nextLine method, we need to handle it with an extra empty nextLine method.
        System.out.println("enter your full name ");
        String fullName= keyboard.nextLine();

        String orderDetails= fullName + ", your order for " + quantity+" " +product + " has been places. Your total is $ " + (price * quantity);
        System.out.println(orderDetails);




    }

}
