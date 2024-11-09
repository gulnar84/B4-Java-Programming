package day08_scanner_logical_operators;

public class ShortCircuit {
    public static void main(String[] args) {
        // Difference between && vs & ---- || vs |

        int i = 10;
        System.out.println(false && ++i > 5);
        // SHORT CIRCUIT AND

        System.out.println(i); // 10 olur becouse Since first half of && is false, the second half never gets executed,
        // hence i never gets incremented

        System.out.println("----");

        int y = 10;
        System.out.println(false & ++y > 5);
        // Regular AND
        System.out.println(y);


        System.out.println("----");

        int x = 10;
        System.out.println(true && ++x > 5);
        // Regular AND
        System.out.println(x);






    }
}


