package src;

import java.util.function.Function;

public class AssigningVariableToFun {
    protected static class MyMath {
        public static Integer triple(Integer x){
            return 3*x;
        }
    }

    public static void main(String[] args) {
        Function<Integer,Integer> myTriple = MyMath::triple;
        int result=myTriple.apply(10);
        System.out.printf(String.valueOf(result));
    }
}