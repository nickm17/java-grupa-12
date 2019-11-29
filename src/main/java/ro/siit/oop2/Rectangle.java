package ro.siit.oop2;

import ro.siit.oop.Shape;

public class Rectangle extends Shape {
    private int length;
    private int width;


    @Override
    public int computeAria() {
        int aria; // variabila locala
        aria = 2;

//        int ariaLaPatrat = aria * aria;
        System.out.println("Dreptunghi");
//        this.aria = length * width; // daca aria ar fi public in Shape am avea acces la el in sublclasa
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // exemplu de overloading - numar sau tip diferit al parametrilor
    public int getWidth(long length) {
        return width;
    }

    public int getWidth(String sss, int length) {
        return width;
    }

    public static void setWidth(int width) {
        width = width;
    }
}
