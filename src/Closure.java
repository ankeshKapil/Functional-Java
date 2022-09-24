package src;

import java.util.function.Function;

public class Closure {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGeeter = ()->{
            String name ="Ankesh";
            return ()-> "Hello" + name;
        };

        System.out.println(createGeeter.apply().apply());
    }
}
