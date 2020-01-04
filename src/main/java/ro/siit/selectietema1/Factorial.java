package ro.siit.selectietema1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number to calculate factorial: ");
        int n = scanner.nextInt();
        int a = 1;

        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        System.out.println("The factorial of " + n + " is: " + a);
    }
}
