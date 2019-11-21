package ro.siit.functions;

public class Fibonacci {

    static int n1 = 0, n2 = 1, n3 = 0;
    //        System.out.print(n1 + " " + n2);//printing 0 and 1
//        printFibonacci(count);
//        System.out.println(
//                fibonacci(1)
//        );
    public static void main(String args[]) {
        int countDinMain = 10;

//        printFibonacci(countDinMain);
        System.out.println(fibonacci(10));
    }

    static int fibonacci(int n ) {
        System.out.println(n);
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n -1) + fibonacci(n -2);
    }

    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
        if(count > 0){

            System.out.println("Finally am iesit din if  " + count);
        }
    }
}
