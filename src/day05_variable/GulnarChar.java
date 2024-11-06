package day05_variable;

public class GulnarChar {

    public static void main(String[] args) {
        char letter1 = 'G';
        char letter2 = 'u';
        char letter3 = 'l';
        char letter4 = 'n';
        char letter5 = 'a';
        char letter6 = 'r';

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter5);
        System.out.println(letter6);
        System.out.println("-----------------");
        System.out.println(0 + letter1);
        System.out.println(0 + letter2);
        System.out.println(0 + letter3);
        System.out.println(0 + letter4);
        System.out.println(0 + letter5);
        System.out.println(0 + letter6);
        System.out.println("-----------");

        System.out.println(letter1+letter2+letter3+letter4+letter5+letter6); //int
        String myName = "" + letter1 + letter2 + letter3 + letter4 + letter5 + letter6; // String
        System.out.println(myName);



    }
}
