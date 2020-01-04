package ro.siit.selectietema1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number and press enter: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number and press enter: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("Enter operator and press enter: ");
        String operator = scanner.next();

        double result = 0;
        if ("+".equals(operator)) {
            result = firstNumber + secondNumber;
        } else if ("-".equals(operator)) {
            result = firstNumber - secondNumber;
        } else if ("*".equals(operator)) {
            result = firstNumber * secondNumber;
        } else if ("/".equals(operator)) {
            result = firstNumber / secondNumber;
        }

        System.out.println("The result of " + firstNumber + " " + operator + " " + secondNumber + " is: " + result);

    }

}
