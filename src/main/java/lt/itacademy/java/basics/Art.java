package lt.itacademy.java.basics;

import java.util.Scanner;

public class Art {
    public static void main(String[] args) {

        String c = "";
        do {
            System.out.print("Enter tree height: ");
            Scanner scanner = new Scanner(System.in);
            int height = Integer.parseInt(scanner.nextLine());
            drawTheTree(height);
            System.out.print("\nWould you like to continue? (y/n) ");
            c = scanner.nextLine();
            System.out.println();
        } while (c.equalsIgnoreCase("y"));
    }

    static void drawTheTree(int height) {

        for (int i = 0; i <= height; i++) {
            // print spaces
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            // print hashes
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("#");
            }
            // move to next line
            System.out.println();
        }
        // draw the tree trunk
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("#");
    }
}
