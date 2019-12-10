package ro.siit.oop2.interfaces;

//@FunctionalInterface
public interface Domestic extends Domestic2, Runnable{

//    abstract void pet();
//    public abstract void pet();
    void pet();

    public final static String OWNER = "Jack";
//     static String OWNER2;// variabilele din interfete nu pot fi decat constante - static final
     final static String OWNER3 = "Jack";
     final String OWNER4 = "Jack";
    String OWNER5 = "Jack";


    public default void doSomethingDefault(){
        System.out.println("in default method");
    }

    public static void doSomethingStatic(){
        System.out.println("in static method");
    }
}
