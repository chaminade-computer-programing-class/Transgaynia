package methods;

import java.util.Scanner;


public class Enter{
    static Scanner ash = new Scanner(System.in);

    public static void enter() {
        String input;
        input = ash.nextLine();
            if (input.equals("")) {
                System.out.println();

            }
    }
}