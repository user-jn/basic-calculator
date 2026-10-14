package com.pluralsight;
import java.util.Scanner;     // import the Scanner class
import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = read.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = read.nextInt();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String option = read.next();

        // Ignore the option and always multiply
        int answer = firstNumber * secondNumber;

        System.out.printf("%d * %d = %d%n", firstNumber, secondNumber, answer);

        read.close();




    }
}
