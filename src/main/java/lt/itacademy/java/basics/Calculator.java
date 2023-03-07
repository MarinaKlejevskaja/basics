package lt.itacademy.java.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c = "";
        do {
            System.out.print("Type in figure type: ");
            String figure = scanner.nextLine();
            figureCalculator(figure);
            System.out.print("\nWould you like to continue? (y/n) ");
            c = scanner.nextLine();
            System.out.println();
        } while (c.equalsIgnoreCase("y"));
    }

    static int[] getFigureParameters() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int[] arrOfInt = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrOfInt[i] = Integer.parseInt(arr[i]);
        }
        return arrOfInt;
    }


    //calculate square perimeter and area
    static void calculatePerimeterAndArea(int a) {
        if (a == 0) {
            System.out.println("Square edge length can’t be 0.");
        } else if (a < 0) {
            System.out.println("Square edge length can’t be less than 0.");
        } else {
            int perimeter = a * 4;
            int area = a * a;
            System.out.println("Square perimeter is " + perimeter + " and area is " + area + ".");
        }
    }

    //calculate rectangle perimeter and area
    static void calculatePerimeterAndArea(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("Rectangle edge length can’t be 0.");
        } else if (a < 0 || b < 0) {
            System.out.println("Rectangle edge length can’t be less than 0.");
        } else {
            int perimeter = a * 2 + b * 2;
            int area = a * b;
            System.out.println("Rectangle perimeter is " + perimeter + " and area is " + area + ".");
        }
    }

    //calculate triangle perimeter and area
    static void calculatePerimeterAndArea(int a, int b, int c) {
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("Triangle edge length can’t be 0.");
        } else if (a < 0 || b < 0 || c < 0) {
            System.out.println("Triangle edge length can’t be less than 0.");
        } else if ((a + b <= c) || (b + c <= a) || (c + a <= b)) {
            System.out.println("Not a valid input: any two sides must be smaller than third side");

        } else {
            int perimeter = a + b + c;

            float sp = (float) perimeter / 2; //semi perimeter
            float area = (float) Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
            System.out.println("Triangle perimeter is " + perimeter + " and area is " + area + ".");
        }
    }

    static void figureCalculator(String figure) {
        switch (figure.toLowerCase()) {
            case "square":
                System.out.print("Enter square side: ");
                try {
                    int[] squareParameters = getFigureParameters();
                    int a = squareParameters[0];
                    calculatePerimeterAndArea(a);
                } catch (Exception e) {
                    System.out.println("Something went wrong: " + e);
                }
                break;
            case "rectangle":
                System.out.print("Enter rectangle sides (space separated): ");
                try {
                    int[] rectangleParameters = getFigureParameters();
                    int b = rectangleParameters[0];
                    int c = rectangleParameters[1];
                    calculatePerimeterAndArea(b, c);
                } catch (Exception e) {
                    System.out.println("Something went wrong: " + e);

                }

                break;
            case "triangle":
                System.out.print("Enter triangle sides (space separated): ");
                try {
                    int[] triangleParameters = getFigureParameters();
                    int d = triangleParameters[0];
                    int e = triangleParameters[1];
                    int f = triangleParameters[2];
                    calculatePerimeterAndArea(d, e, f);
                } catch (Exception e) {
                    System.out.println("Something went wrong: " + e);
                }
                break;
            default:
                System.out.println("Figure not found");
        }
    }
}
