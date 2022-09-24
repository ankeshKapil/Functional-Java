package src;

import java.util.function.Function;

public class LambdaExpressions {
    public static void main(String[] args) {
        Function<Integer,Integer> lambdaFun = (x)->x+1;
        Function<String,Integer> multiLine = (a)->{
            Integer b = a.length();
            return b;
        };
        System.out.printf(String.valueOf(lambdaFun.apply(5)));
    }
}
