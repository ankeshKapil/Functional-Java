package src;

import java.util.function.Function;

public class ReturnFunctions {

    protected static class MyMath {

        public static Integer timesTwo(Integer x){
            return 2*x;
        }
        public static Integer timesThree(Integer x){
            return 3*x;
        }
        public static Integer timesFour(Integer x){
            return 4*x;
        }

        public static Function<Integer,Integer> createMultiplier(Integer y){
            return (x)->x*y;
        }
    }



    public static void main(String[] args) {

        NoArgFunction<NoArgFunction<String>> letsBlowYourMind = ()-> ()-> "haha";

        System.out.println(letsBlowYourMind.apply().apply());


        Function<Integer,Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer,Integer> timesThree = MyMath.createMultiplier(3);
        System.out.println(timesTwo.apply(2));


    }
}
