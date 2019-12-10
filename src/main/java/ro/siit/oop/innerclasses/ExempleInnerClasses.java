package ro.siit.oop.innerclasses;

import ro.siit.oop.Shape;

public class ExempleInnerClasses {

    public static void main(String[] args) {
        Car.Trabant trabant = new Car().new Trabant();
        Car.Dacia dacia = new Car.Dacia();

        Car car = new Car();
//        Car car2 = new Car(1,2,2,2332,2);
//        car.setSpeed(2);
        InterfataFunctionala interfataFunctionala = new InterfataFunctionala() { // clasa anonima
            @Override
            public int printSomething() {
                System.out.println("Clasa Anonima");
                return 55;
            }
//
//            @Override
//            public void printSomethidng() {
//
//            }
//
//            @Override
//            public void printSomethdsdsing() {
//
//            }
        };

        interfataFunctionala.printSomething();
        interfataFunctionala.printSomething();
        interfataFunctionala.printSomething();
        interfataFunctionala.printSomething();

        Runnable run = new Runnable() {
            @Override
            public void run() {

            }
        };

        Shape shape = new Shape() {
            @Override
            public int computeAria() throws IllegalArgumentException {
                return 0;
            }
            @Override
            public int computeAriaShape() {
                return 23232;
            }
        };

        metodaCuParametruLambda(interfataFunctionala); // varianta 1
        InterfataFunctionala lambda = () -> { // type inference
            System.out.println("Lambda");
            return 2;
        };
        lambda.printSomething();
        metodaCuParametruLambda(lambda); // varianta 2


    }

//    @SuppressWarnings()
    static void metodaCuParametruLambda(InterfataFunctionala interfataFunctionala){
        Integer integer = new Integer(1);

        System.out.println(interfataFunctionala);
    }
}

@FunctionalInterface
interface InterfataFunctionala {
    int printSomething();
//    void printSomethidng();
//    void printSomethdsdsing();
}