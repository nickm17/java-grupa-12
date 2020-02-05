package ro.siit.oop2.interfaces;

import java.io.Serializable;

public class Cat extends Animal implements Domestic, Serializable, Cloneable {
    @Override
    void eat() {
        System.out.println("eat");
    }

    @Override
    public void pet() {
        System.out.println("pet");
    }

    @Override
    public double speed() {
        return 0;
    }

    @Override
    public void doSomethingDefault() {
        Domestic.super.doSomethingDefault();
    }

//    public static void doSomethingStatic(){
//        System.out.println("in static method in cat");
//    }


    public static void main(String[] args) {
        Domestic domestic = new Cat();
        String owner = Domestic.OWNER;
        Cat cat = new Cat();
        cat.doSomethingDefault();
        domestic.doSomethingDefault();
        Domestic.doSomethingStatic(); // metodele statice se apeleaza cu numele clasei/interfetei
        // Cat is a Cat
        // Cat is an Animal
        // Cat is Domestic
        // ....

//        cat.doSomethingStatic(); // wrong
        cat.doSomethingDefault();
        cat.eat();
        cat.pet();

    }


}
