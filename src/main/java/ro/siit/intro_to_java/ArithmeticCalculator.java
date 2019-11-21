package ro.siit.intro_to_java;

import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {
        Scanner altScanner = new Scanner(System.in); // acesta il folositi si voi exact asa cum e folosit aici pentru moment
        // el ne ajuta sa citim valorile tastate in consola
        // atunci cand il importati, verificati sa fie din pachetul java.util
        calculate(altScanner);
        // aceasta e o functie din java pe care o folosim sa printam ceva in consola
        // o folositi si voi asa cum e si o sa discutam mai pe larg la curs despre ea
    }

    private static void calculate(Scanner altScanner) {
        while (true) {
            double firstNumber = FlowControl.getANumberFromKeyboard(altScanner, "Enter first number and press enter: ");
            double secondNumber = FlowControl.getANumberFromKeyboard(altScanner, "Enter second number and press enter: ");

            System.out.println("Enter operator and press enter: ");
            String operator = altScanner.next();
            double result = 0;
            switch (operator) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Semnul introdus nu e valid");
                    return; // acest return are scopul de a opri executia pentru a nu mai printa resultatul mai jos in cazul in care operandul introdus nu este corect
            }
            System.out.println("The result of " + firstNumber + " " + operator + " " + secondNumber + " is: " + result);

            System.out.println("Do you want to calculate more? Yes/No");
            String answer = altScanner.next();
            if (answer.equalsIgnoreCase("No")) {
                break;
            }
        }
    }


}
