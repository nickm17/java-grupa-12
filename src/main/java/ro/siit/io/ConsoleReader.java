package ro.siit.io;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {


    public static void main1(String[] args) throws IOException {
        //Enter data using BufferReader
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Reading data using readLine
        System.out.println("Enter something:");
        String name = reader.readLine();
//        reader.lines();

        // Printing the read line
        System.out.println(name);
    }

    public static void main(String[] args) throws IOException {
        // Using Console to input data from user
        Console console = System.console();

        if (console != null) {
            String name = console.readLine();
            System.out.println(name);
        }
//        // Printing the read line
        System.out.println("name");


//        int ch;
//        System.out.print ("Enter some text: ");
//        while ((ch = System.in.read()) != '\n') {
//            System.out.println(ch);
//            System.out.print((char) ch);
//        }
    }

}
