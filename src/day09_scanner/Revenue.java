package day09_scanner;
    /*
    Write a program that asks the user to enter
        a price
        and quantity

        and then calculate the revenue. revenue = price × quantity.
 */
// #1 - DO IMPORT
// Q: Why we need to import
// A: Since we are working in one package, but we need something from different package, we need to import it first to be able to use anything inside of that package
import java.util.Scanner;//niye orange olmur cunki biz declare etdik but // we have imported package but we havenot used anything

    public class Revenue {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            double revenue;
            System.out.print("Please, enter the price of the item: $");// bundan sonra biz outputda enter etsek de hec ne yoxdu cunku we havent used any method and we need to call,ask to use that method

            double price = input.nextDouble(); // Taking value from user. --- >  storing it into variable called price

            System.out.print("Please, enter the quantity of the item: ");
            int quantity = input.nextInt();

            revenue = price * quantity;  // double * int -- > bigger datatype --> double
            System.out.println("The revenue of the sale is: $" + revenue);



        }
    }

