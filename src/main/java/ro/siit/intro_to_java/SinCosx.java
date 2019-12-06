package ro.siit.intro_to_java;

import java.util.Scanner;

public class SinCosx {
String sss;

    public SinCosx(String sss) {
        this.sss = sss;
    }

    public void setSss(String sss) {

        this.sss = sss;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = '\u0000';
        System.out.println(ch);
        System.out.println("Enter a double: ");
        double x = scanner.nextDouble();

        double result = Math.sin(x) * Math.sin(x) + Math.cos(x) * Math.cos(x);

        System.out.println(result);

    }
}
