package ro.siit.oop;

public class Circle extends Shape {

    private int radius;

    @Override
    public void draw(){
        System.out.println("Draw Circle");
    }

    @Override
    public int computeAria() {
        return (int)(Math.PI * Math.pow(this.radius, 2));
    }
}
