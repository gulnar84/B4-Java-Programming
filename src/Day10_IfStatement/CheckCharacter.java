package Day10_IfStatement;

/*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
    find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
 */
public class CheckCharacter {
    public static void main(String[] args) {
        char letter = 'y';

        if ('a' <= letter && letter >= 'z') {
            System.out.println("lower case letter");
        }

        if ('A' <= letter && letter >= 'Z') {
            System.out.println("upper case letter");

        }
    }
}
