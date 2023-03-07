package lt.itacademy.java.basics;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.print("Enter triangle sides (space separated): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        int c = Integer.parseInt(inputs[2]);
        defineTriangleType(a, b, c);

        System.out.print("\nEnter distance, fuel left in tank, fuel usage, fuel price (space separated): ");

        String input2 = scanner.nextLine();
        scanner.close();
        String[] inputs2 = input2.split(" ");

        int distance = Integer.parseInt(inputs2[0]);
        int fuelInTank = Integer.parseInt(inputs2[1]);
        double fuelUsage = Double.parseDouble(inputs2[2]);
        double price = Double.parseDouble(inputs2[3]);
        calculateFuelReserves(distance, fuelInTank, fuelUsage, price);
    }

    static void defineTriangleType(int a, int b, int c) {

        boolean isValid = (a + b > c && b + c > a && c + a > b);

        if (isValid) {
            boolean isEquilateral = (a == b && b == c);
            boolean isIsosceles = ((a == b && b != c) || (a != b && b == c));
            boolean isScalene = (a != b && b != c);

            if (isEquilateral) {
                System.out.println("Triangle is Equilateral. Sides: " + a + " " + b + " " + c);
            } else {
                if (isIsosceles) {
                    System.out.println("Triangle is Isosceles. Sides: " + a + " " + b + " " + c);
                } else if (isScalene) {
                    System.out.println("Triangle is Scalene. Sides: " + a + " " + b + " " + c);
                }
            }
        } else {
            System.out.println("Triangle is invalid. Sides: " + a + " " + b + " " + c);
        }
    }

    static void calculateFuelReserves(int distance, int fuelInTank, double fuelUsage, double price) {
        double fuelToDistanceDemand = distance * fuelUsage / 100;
        boolean isEnoughFuel = fuelToDistanceDemand <= fuelInTank;
        double fuelDifference = Math.abs(fuelToDistanceDemand - fuelInTank);

        if (isEnoughFuel) {
            System.out.println("Destination is in " + distance + "km. Car is able to reach the destination. It will have " + fuelDifference + " liter(s) of fuel left.");
        } else {
            double additionalCost = fuelDifference * price;
            System.out.println("Destination is in " + distance + "km. Car is not able to reach the destination. It needs " + fuelDifference + " liter(s) of fuel more. It will cost " + additionalCost + ".");
        }
    }
}
