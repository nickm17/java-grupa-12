package ro.siit.oop;

import ro.siit.oop2.Rectangle;

public class PlayWithShapes2 {

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        // referinta de tipul superclasei si instanta de tipul subclasei
        // la copilare foloseste methoda din superclasa
        // iar la rulare foloseste versiunea suprascrisa din subclasa
        Shape circle = new Circle();
        circle.draw();

        // referinta de tipul superclasei si instanta de tipul subclasei
        // la copilare foloseste methoda din superclasa
        // la rulare foloseste tot aceeasi methoda mostenita din superclasa pentru ca nu am mai suprascris acea methoda in subclasa Rectangle
        Shape rectangle = new Rectangle();
        rectangle.draw();

        // cu referinta de tipul superclasei nu avem acces la metodele din subclasa, pentru a avea acces trebuie sa ii facem un cast
//        ((Rectangle) rectangle).getLength();
    }

}
