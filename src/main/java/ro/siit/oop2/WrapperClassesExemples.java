package ro.siit.oop2;

import java.util.Arrays;

import ro.siit.oop.Shape;

public class WrapperClassesExemples {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer.max(2, 1);

        float v = Float.parseFloat("1212f");

        Boolean bool = Boolean.FALSE;
        Boolean.valueOf("true");

        Integer.parseInt("1");
        Integer.valueOf("1");
        System.out.println(v);

        System.out.println(Arrays.toString(new Shape[20]));
        System.out.println(Arrays.deepHashCode(new Shape[22] ));

    }
}
