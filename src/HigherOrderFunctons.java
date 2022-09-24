package src;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunctons {

    public static void main(String[] args) {
        BiFunction<Float,Float,Float> divide = (x,y)->x/y;

        Function<BiFunction<Float,Float,Float>,BiFunction<Float,Float,Float>>
                secondArdIsntZero= (func)->(x,y)->{
            if(y==0f){
                System.out.println("second arg is zero");
                return 0f;
            }
            return func.apply(x,y);
        };

        BiFunction<Float,Float,Float> divideSafe = secondArdIsntZero.apply(divide);

        System.out.println(divideSafe.apply(1f,0f));
    }
}
