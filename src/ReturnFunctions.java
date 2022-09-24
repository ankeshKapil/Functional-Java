package src;

public class ReturnFunctions {



    public static void main(String[] args) {

        NoArgFunction<NoArgFunction<String>> letsBlowYourMind = ()-> ()-> "haha";

        System.out.println(letsBlowYourMind.apply().apply());


    }
}
