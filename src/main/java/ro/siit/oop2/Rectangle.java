package ro.siit.oop2;

import ro.siit.oop.Shape;

public class Rectangle extends Shape {
    private int length;
    private int width;

    @Override
    public int computeAria() {
        return length * width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
