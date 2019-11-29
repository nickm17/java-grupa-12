package ro.siit.oop;

import ro.siit.oop2.Rectangle;

//import static ro.siit.oop2.Rectangle.setWidth;

public class PlayWithShapes2 {

    public static void main(String[] args) {
//        Shape shape = new Shape();
//        shape.draw();
//        setWidth(2); // exemplu de folosire a importului static
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
        rectangle.setAria(1);
        // cu referinta de tipul superclasei nu avem acces la metodele din subclasa, pentru a avea acces trebuie sa ii facem un cast
//        ((Rectangle) rectangle).getLength();
//        rectangle.setAria(2);
//        this.clone();  // this nu se poate folosi in metode statice
//        computeAria(); // nici nu putem apela metode nestatice din metode statice

        Circle circlex = new Circle();
        circlex.draw();// bag practice , metodele statice se apeleaza cu numele clasei
//        circlex.draw();
        Circle.draw();
        Shape trianglex = new Triangle();
        Shape rectanglelx = new Rectangle();
        Shape shapex = null;
//        int i = null;
        shapex.computeAria();
//        circlex = trianglex;
//        if(shapex instanceof Circle){
//            Circle circle = (Circle)circlex;
//        }

        Shape [] shapes = new Shape[3];
        shapes[0] = trianglex;
        shapes[1] = circlex;
        shapes[2] = rectanglelx;

        for (Shape shapeInFor : shapes) {
//            shapeInFor.computeAria();
            shapeInFor.draw();
        }

    }

    public int computeAria() {
//        int aria = 0; // variabila locala
        return 0;
    }
}
