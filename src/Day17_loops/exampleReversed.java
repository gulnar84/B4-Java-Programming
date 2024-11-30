package Day17_loops;

public class exampleReversed {
    public static void main(String[] args) {
        String word="Gulnar";

        String reversed="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed += word.charAt(i);
        }
            System.out.println("orginal:"+word);
            System.out.println("reversed:"+reversed);
        }
    }

