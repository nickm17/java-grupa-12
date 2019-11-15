package ro.siit;

import java.util.Scanner;

public class SinCosx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a double: ");
        double x = scanner.nextDouble();

        double result = Math.sin(x) * Math.sin(x) + Math.cos(x) * Math.cos(x);

        System.out.println(result);

    }
}
