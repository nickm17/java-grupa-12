package ro.siit.oop;

public class Color {
    private String name;
    private int intensity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    // metoda toString() ne ajuta sa aducem obiectul intr-o forma pe care sa o intelegem cand este printat
    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", intensity=" + intensity +
                '}';
    }
}
