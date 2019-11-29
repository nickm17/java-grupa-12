package ro.siit.oop;

public abstract class Shape {
    // variabilele statice sunt specifice clasei , aceeasi valoare o sa aiba pentru tiatee instantele clasei
    public static Color color;
    private Color color1;
    private int aria;

    public static void main(String[] args) {

    }


    public static void draw(){ // nu poate fi suprascrisa
        System.out.println("Draw Shape");
    }

    public abstract int computeAria() throws IllegalArgumentException;


    public int getAria() {
        return aria;
    }

    public void setAria(int aria) {
        // avand campurile clasei private putem sa adaugam validari in metodele
        // publice ce opereaza pe acele campuri
        if (aria < 0){
            throw new IllegalArgumentException("Invalid value for aria " + aria);
        }

        // this.aria se refera la campul aria(de la nivel de clasa)
        //  aria fara this se refera la variabila locala din parametrul metodei
        this.aria = aria;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }
}
