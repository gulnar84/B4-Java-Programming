package Day18_Loops;

    import java.util.Scanner;

    /*
        Count Words
        Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words in this sentence

            Output:
                4
     */
    public class CountWords {
        public static void main(String[] args) {
            Scanner key = new Scanner(System.in);
            System.out.print("Please, enter a sentence: ");
            String sentence = key.nextLine().trim(); // This has multiple words in this sentence

            int countSpace = 0;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {          // how many empty spaces if i have that will give me how many words i have, 4 empty space that means 5 words

                    countSpace++;
                }
            }

            System.out.println("There are " + (countSpace+1)+ " words in this sentence.");

        }
    }

