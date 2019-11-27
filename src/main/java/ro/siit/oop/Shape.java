package ro.siit.oop;

public class Shape {
    // variabilele statice sunt specifice clasei , aceeasi valoare o sa aiba pentru tiatee instantele clasei
    static Color color;
    private int aria;

    public static void main(String[] args) {

    }

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

    public void draw(){
        System.out.println("Draw Shape");
    }

    public int computeAria(){
        return 0;
    }
}
