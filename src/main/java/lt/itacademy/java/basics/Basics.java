package lt.itacademy.java.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        System.out.print("type in your name, surname and age (space separated): ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        String[] words = input.split(" ");
        System.out.println("Hello my name is " + words[0] + " " + words[1] + " and I am " + words[2] + " years old. I am attending IT & Data Academy 2023!");


        //H3110 w0r1d 2.0 true
        String one = "H";
        long two = 3110l;
        String three = " ";
        char four = 'w';
        short five = 0;
        char six = 'r';
        byte seven = 1;
        String eight = "d ";
        double nine = 2.0d;
        String ten = " ";
        boolean eleven = true;

        System.out.println(one + two + three + four + five + six + seven + eight + nine + ten + eleven);

    }
}


