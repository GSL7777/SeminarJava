package Seminar1.hw;

import java.util.Scanner;

//Реализовать простой калькулятор
// Использовать сканнер:
// Scanner scanner = new Scanner(System.in);
// String enter = scanner.next();
// int i = Integer.parseInt(enter);
public class Hw3 {
    public static void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double first_num = scanner.nextDouble();
        System.out.println("Enter the operation:");
        String operation = scanner.next();
        System.out.println("Enter the second number:");
        double second_num = scanner.nextDouble();


        if (operation.equals("+")) {
            double res = first_num + second_num;
            System.out.print("Result: " + res);
        } else if (operation.equals("-")) {
            double res = first_num - second_num;
            System.out.printf("Result: " + res);
        } else if (operation.equals("*")) {
            double res = first_num * second_num;
            System.out.printf("Result: " + res);
        } else if (operation.equals("/")) {
            double res = first_num / second_num;
            System.out.print("Result: " + res);
        } else {
            System.out.println("Operation is not found. Try again.");
        }
    }
}

