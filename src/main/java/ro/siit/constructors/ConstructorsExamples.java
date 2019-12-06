package ro.siit.constructors;

public class ConstructorsExamples {

    public static void main(String[] args) {
        try {
            Mercedes mercedes = new Mercedes(2);
//            System.out.println(mercedes.equals(new Car("")));
            System.out.println(mercedes.equals(new Mercedes(2)));
            System.out.println(mercedes);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Car {
    private String color;
    private Car() {
        System.out.println("No param contructor in Car");
    }

    public Car(String color) throws Exception {
        super();
        System.out.println("String param constructor in Car   " + color);
    }
}

class Mercedes extends Car {
    private int speed;
    public Mercedes() throws Exception {
        super("Red"); // cand avem constructorul default private in
        System.out.println("No param constructor in Mercedes ");
    }

    public Mercedes(int speed) throws Exception {
        this();
        this.speed = speed;
        System.out.println("Int param constructor in MErcedes "+ speed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mercedes mercedes = (Mercedes) o;
        return speed == mercedes.speed;
    }

    @Override
    public int hashCode() {
        int hash = Float.hashCode(speed);
        return hash * 13;
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "speed=" + speed +
                '}';
    }
}