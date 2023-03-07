package lt.itacademy.java.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.print("Type in days: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int days = Integer.parseInt(input);
        calculateHoursAndMinutes(days);

        System.out.print("\nType in number to calculate factorial: ");
        String input2 = scanner.nextLine();
        scanner.close();
        int num = Integer.parseInt(input2);
        calculateFactorial(num);
    }

    static void calculateHoursAndMinutes(int days) {
        int hours = 0;
        int minutes = 0;
        int i = 0;
//        for (int i = 0; i < days; i++) {
//
//            hours += 24;
//            minutes += 24*60;
//        }
        while (i < days) {
            hours += 24;
            minutes += 24 * 60;
            i++;
        }

        System.out.println("There are " + hours + " hours or " + minutes + " minutes in " + days + " days.");
    }

    static void calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of number " + num + " is " + factorial + ".");
    }
}
