package ro.siit.oop;

public class Circle extends Shape {

    private int radius;

//    @Override
    public static void draw(){
        System.out.println("Draw Circle");
    }

    @Override
    public int computeAria() throws RuntimeException {
        System.out.println("Cerc");
        return (int)(Math.PI * Math.pow(this.radius, 2));
    }
    public int computeAriaCircle() {
        System.out.println("Cerc");
        return (int)(Math.PI * Math.pow(this.radius, 2));
    }

}
