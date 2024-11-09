package day07_releational_operators;

public class OperatorPractice2 {
    public static void main(String[] args) {
        int t = 100; // 101 -> 100 -> 101 -> 100

        int p = - ++t * t-- / t++ + --t;
        // p = '-' 101 '*' 101 '/' 100 '+' 100
        // p = -101 '*' 101 '/' 100 '+' 100
        // p = -101 * 101 / 100 '+' 100 -- >  -10201 / 100 '+' 100// 1st 10201/100=102.01 we take whole number 102 and - 102
        // p = -102 + 100 --- > -2

        System.out.println(t);
        System.out.println(p);


        /*
              1)      ++     --
              2)      -(making it negative)
              3)      *    /    %
              4)      +     -
         */
    }
}
