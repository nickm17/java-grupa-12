package ro.siit.strings;

public class Calculator {
    public int evaluate(String expression){
        int sum = 0;
        String[] splited = expression.split("\\+");
        for ( String exp: splited) {
           sum += Integer.valueOf(exp);
        }
        return sum;
    }
}
