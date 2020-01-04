package ro.siit.selectietema1;

import java.util.Scanner;

public class MaxDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int number = scanner.nextInt();
        int lastDigit, maxDigit = 0;

        while (number > 0) {
            lastDigit = number % 10;
            if (maxDigit < lastDigit) {
                maxDigit = lastDigit;
            }
            number = number / 10;
        }
        System.out.println("The maximum digit of a number is: " + maxDigit);
    }
}
