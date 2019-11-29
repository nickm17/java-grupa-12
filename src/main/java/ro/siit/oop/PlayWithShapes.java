package ro.siit.oop;

import ro.siit.oop2.Rectangle;

public class PlayWithShapes {

    public static void main(String[] args) {
//        Shape shape1 = new Shape(); // nu mai putem sa instantiem clasa Shape pentru ca am facut-o abstracta
//        Shape shape2 = new Shape();
//        Shape shape3 = new Shape();
//        Shape shape4 = new Shape();
//        shape.aria = -1; // asa am face referinta la campuri fara getteri si setteri - bad practice nu respecta pricipiul encapsulation
//        shape.color = new Color();

        Color color = new Color();
        color.setIntensity(10);
        color.setName("Green");
        Shape.color = color; // aici se modifica campul color la nivel de clasa
        // Shape.color  - variabilele si methodele se acceseaza cu numele clasei iar schimbarea este vizibila in toate instantele clasei
//        shape.setColor(color);  // bad practice , nu e ok sa avem getteri si setteri pentru variabile statice
//        shape1.setAria(1); // aici se modifica valoarea campului aria numai in obiectul shape1

//        System.out.println(shape1.getAria());
//        System.out.println(Shape.color);
//        System.out.println(shape1.color1);

//        System.out.println(shape2.color1);
//        Color color2 = new Color();
//        color2.setIntensity(110);
//        color2.setName("Red");
//        shape2.color = color2; // e acelasi lucru ca si atunci cand schimbam valoarea campului static cu numele clasei, tot la nivel de clasa se schimba si asa pentru ca e static
        // cum e aici schimbat nu e ok- (bad practice) pentru ca ne poate induce in eroare, color fiid un camp static el trebuie accesat cu numele clasei
        // chiar si cand folosim numele unei instante a clasei , schimbarea este vizibila in toate celelalte intante ale clasei
//        System.out.println(shape2.color);
//        System.out.println(shape3.color);
//        System.out.println(shape4.color);
    }
}
