package lt.itacademy.java.basics;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.print("Input cube’s width: ");
        Scanner scanner = new Scanner(System.in);
        int input1 = Integer.parseInt(scanner.nextLine());

        int volume = input1 * input1 * input1; // cube volume = a*a*a
        int perimeter = input1 * 12; // multiply by 12 edges
        System.out.println("Cube’s volume: " + volume + "cm3.");
        System.out.println("Cube’s perimeter: " + perimeter + "cm.");
        System.out.print("\nAdd first parameter (feet) and second parameter (inches): ");
        String input2 = scanner.nextLine();
        scanner.close();
        convertToCentimeters(input2);
    }

    public static void convertToCentimeters(String input2) {
        String[] values = input2.split(" ");
        double feet = Double.parseDouble(values[0]);
        double inches = Double.parseDouble(values[1]);
        double result = (feet * 12 + inches) * 2.54;
        System.out.println(feet + " feet and " + inches + " inches = " + result + " cm");
    }
}
