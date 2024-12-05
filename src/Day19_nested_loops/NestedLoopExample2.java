package Day19_nested_loops;

public class NestedLoopExample2 {
    public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {

        System.out.println("A" + i );

        for (int j = 0; j < i; j++) {       //1 cycle i =0 0<0 no false that is why 1st cycle nothing print
            System.out.println("B"+j);
        }

    }



}
}