package src;

import java.util.function.BiFunction;

public class MultiArgFunctions {
    public static void main(String[] args) {
        //two args comes by default
        BiFunction<Integer,Integer,String> addTwoNums = (a,b)-> String.valueOf(a+b);

        TriFunction<Integer,Integer,Integer,Integer> addThree = (x,y,z)->x+y+z;

        NoArgFunction<Integer> noArgFunction = ()-> 1;

        System.out.printf(addTwoNums.apply(99,-99));

        System.out.println(addThree.apply(1,2,3));
        System.out.println(noArgFunction.apply());

    }
}
@FunctionalInterface
interface TriFunction<T,U,V,R>{
    R apply(T t,U u,V v);
}

@FunctionalInterface
interface NoArgFunction<R> {

    R apply();
}
