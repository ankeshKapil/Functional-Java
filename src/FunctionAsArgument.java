package src;

import java.util.function.BiFunction;

public class FunctionAsArgument {
    protected static class MyMath{
        public  static Integer add(Integer x, Integer y){
            return x+y;
        }
        public  static Integer sub(Integer x, Integer y){
            return x-y;
        }

        public  static Integer combine2And3(BiFunction<Integer,Integer,Integer> combine){
           return combine.apply(2,3);
        }
    }

    public static void main(String[] args) {
        System.out.println(MyMath.combine2And3(MyMath::add));
        System.out.println(MyMath.combine2And3(MyMath::sub));
        System.out.println(MyMath.combine2And3((x,y)->2*x+2*y));
    }
}
