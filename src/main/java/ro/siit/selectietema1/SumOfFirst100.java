package ro.siit.selectietema1;

public class SumOfFirst100 {

    public static void main(String[] args) {
        int sum = 0;
        for (int index = 0; index <= 100; index++) {
            sum = sum + index;
        }
        System.out.println("Sum of first 100 numbers > 0 is: " + sum);
    }
    //sau folosind formula lui Gauss
//    public static void main(String[] args) {
//        int u = 100;
//        int s = u * (u + 1) / 2;
//        System.out.println(s);
//    }

}
