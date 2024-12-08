package Day20_nested_loops;

public class ContinueInNested {
    public static void main(String[] args) {


        // OUTER LOOP
        for (int i = 0; i < 5; i++) {

            if (i == 3) { // 3=3 olduqda continue olur ve ondan sonraki skip olur ve basa qayidir ona gore 3 print olunmur print skip olub
                continue;
            }

            System.out.println("i: " + i);


            // INNER LOOP
            for (int j = 0; j < 3; j++) {

                if (j == 1) { // same if i=3 kimi yuxardaki kimi
                    continue;
                }

                System.out.println("j: " + j);


            }

        }
        System.out.println("END");
    }
        }
