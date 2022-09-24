package src;

import java.util.function.BiFunction;

public class MultiArgFunctions {
    public static void main(String[] args) {
        //two args
        BiFunction<Integer,Integer,String> addTwoNums = (a,b)-> String.valueOf(a+b);

        System.out.printf(addTwoNums.apply(99,-99));
    }
}
