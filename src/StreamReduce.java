package src;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class StreamReduce {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        BinaryOperator<Integer> getSum = (acc,current)->{
            int result = acc + current;
            System.out.println("accumulator :" +acc+" current :" +current + " result: " + result);
            return result;
        };

        System.out.println(nums.stream().reduce(0,getSum));
    }
}
