package ro.siit.oop2.cast;

import ro.siit.oop.Circle;
import ro.siit.oop.Shape;
import ro.siit.oop.Triangle;
import ro.siit.oop2.Rectangle;
import ro.siit.oop2.interfaces.MarkerInterface;

public class CastExamples {


    public static void main(String[] args) {
        Shape circle = new Circle();
//        circle.computeAriaCircle();
        circle.computeAriaShape();
        Circle c;
        if (circle instanceof Circle) {
            c = (Circle) circle; // down casting
        } else {
            c = null;
        }
        c.computeAriaCircle();
        c.computeAriaShape();
        Shape shape = c; // up casting

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Triangle();

        for (Shape sh : shapes) {
            if (sh instanceof Circle) {
                ((Circle) sh).computeAriaCircle();
                System.out.println("this is a circle");
            }
            if (sh instanceof Triangle) {
                System.out.println("this is a triangle");
            }
            if (sh instanceof Rectangle) {
                System.out.println("this is a rectangle");
            }
            if (sh instanceof Shape) {
                System.out.println("is a shape");
            }

            if (sh instanceof MarkerInterface) {
                System.out.println("is a MarkerInterface");
            }
            if (sh instanceof Object) {
                System.out.println("everything is Object in java");
            }
        }

    }


}
