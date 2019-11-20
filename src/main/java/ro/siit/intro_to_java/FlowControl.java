package ro.siit.intro_to_java;

public class FlowControl {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int x : numbers) {
            if (x == 30) {
                System.out.println("Am intalnit continue, ignoram 30 si continuam cu urmatoarea iteratie!");
                continue;
            }
            if (sum > 100) {
                System.out.println("Am intalnit break, inchidem bucla!");
                break;
            }
            sum += x;
            System.out.println(x);
        }
        System.out.println("sum= " + sum);
    }
}
