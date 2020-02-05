package ro.siit.enums;

import ro.siit.oop2.interfaces.Domestic;

import static ro.siit.enums.Days.MONDAY;

public enum Days implements Domestic {
    MONDAY(1), TUESDAY(2), SATURDAY(6), SUNDAY(7);
    final int index;

     Days(int index) {
        this.index = index;
    }
    public int getIndex(){
         return index;
    }

//    public int abstractSomething();

    @Override
    public void pet() {

    }

    @Override
    public double speed() {
        return 0;
    }
}
class TestEnums{

    enum Gender {
        MALE,
        FEMALE
    }
    public static void main(String[] args) {
//        Enum.valueOf(Days.class, Days.MONDAY);
        for (Days d : Days.values()) {
            System.out.println(d.ordinal()+ "  "+ d.name() + "  " + d.getIndex());
        }



        System.out.println(MONDAY == MONDAY);

        doSwitch(Days.valueOf("MONDAY"));

    }

    private static void doSwitch(Days d) {
        switch (d){
            case MONDAY:
                System.out.println("Monday is not great");
                break;
            case TUESDAY:
                System.out.println("Tuesday is not great");
                break;
            case SATURDAY:
                System.out.println("Saturday is great");
                break;
            case SUNDAY:
                System.out.println("Sunday is great");

        }
    }

}