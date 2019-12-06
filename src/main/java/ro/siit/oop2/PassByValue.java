package ro.siit.oop2;

import java.util.Arrays;

public class PassByValue {

// https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
    public static void main(String[] args) {
        String s = "Ana";
        metodaCuParametruImutabil(s);

        System.out.println(" s in main " + s);

//        Integer i = new Integer(10);
        Integer i = 10;
        int i1 = Integer.parseInt("1");
        metodaCuParametruImutabil(i);
        System.out.println("i in main " + i);

        StringBuilder sb = new StringBuilder(s);
        metodaCuParametruMutabil(sb);
        System.out.println("sb in main " + sb.toString());

        int[] ints = new int[2]; // 0, 0
        ints[0] = 8; // 8, 0
//        Arrays.sort(ints);
        metodaCuParametruArray(ints);
        System.out.println("i in method " + Arrays.toString(ints));
    }

    static void metodaCuParametruImutabil(String s){
        s = s + " are mere";
        s.concat("fdadsasd");
        System.out.println("s in method " + s);
    }

    static void metodaCuParametruMutabil(StringBuilder sb){
        sb.append(" are mere");
//        s.concat("fdadsasd");
        System.out.println("s in method " + sb);
    }

    static void metodaCuParametruImutabil(Integer i){
        i = i + 8;
        System.out.println("i in method " + i);
    }

    static void metodaCuParametruArray(int[] i){
        i[1] = 2;
        System.out.println("i in method " + Arrays.toString(i));
    }

}
