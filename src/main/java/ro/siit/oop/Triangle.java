package ro.siit.oop;

public class Triangle extends Shape {

    private int base;
    private int height;

//    @Override
    public static void draw(){
        System.out.println("Draw Triangle");
    }

    @Override
    public int computeAria() {
        System.out.println("Triunghi");
        return (base*height)/2;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}