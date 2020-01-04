package ro.siit.selectietema1;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println("The prime numbers smaller than " + number + " are: " + i);
            }
        }
    }

    private static boolean isPrime(int number) {

        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}

