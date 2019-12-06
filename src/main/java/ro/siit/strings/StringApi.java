package ro.siit.strings;

import java.util.Arrays;

public class StringApi {

    public static void main(String[] args) {
        String string1 = "Hel3lo 2ndwo3rld , bla3bla";

        String dddddd = string1.concat("dddddd");
        System.out.println(dddddd);

        String upper = string1.toUpperCase();
        System.out.println(upper);

        System.out.println("length" + string1.length());
        System.out.println("charAt" + string1.charAt(1));
        System.out.println("indexOf" + string1.indexOf("x"));
        System.out.println("contains " + string1.contains("world"));
        System.out.println("substring " + string1.substring(1));
        System.out.println("substring " + string1.substring(7, 11));
        System.out.println("contains " + string1.contains("world"));
        System.out.println("starts " + string1.startsWith("hello"));
        System.out.println("ends " + string1.endsWith("world"));

        String[] split = string1.split(",");
        System.out.println(Arrays.toString(split));
        for (int i = 0 ; i < split.length ; i++ ) {
            split[i] = split[i].trim();
        }
        System.out.println(Arrays.toString(split));

        // "[a-z]"
        // "[0-9]"
        // "[a-zA-Z]"
        // "[a-zA-Z0-9]"
        // https://www.tutorialspoint.com/java/java_regular_expressions.htm
        // https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html


        String[] splitByDigit = string1.split("\\d");
        String[] splitBySpace = string1.split("\\s");
        System.out.println(Arrays.toString(splitByDigit));
        System.out.println(Arrays.toString(splitBySpace));

        System.out.println(string1.replaceAll("\\d", "aaaa"));

        System.out.println(String.format("%-40s", string1) + "ddasdas");
        System.out.printf("%35s", string1);

        System.out.println();
        System.out.println(1 + 1.2 +"1");
        System.out.println("1" + 1 + 1);

        long i = 1 + 1L;
        float ii = 1 + (float)10.2252;
        System.out.println(string1);



        StringBuilder stringBuilder = new StringBuilder("old string");
        stringBuilder.append(" new string");
        stringBuilder.insert(4, "inserted ");
        stringBuilder.delete(1, 2);
//        stringBuilder.deleteCharAt(0);
        stringBuilder.reverse();

        System.out.println(stringBuilder.toString());


    }

}
