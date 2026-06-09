package IntermediateLevel;

import java.util.Arrays;
import java.util.List;

//17.Find Sum of All Elements
public class Ques17 {

    public static void main(String[] args) {

        List<Integer> numberList= Arrays.asList(11,21,33,6,18,14);

        int sumOfElem = numberList
                .stream()
                .reduce(0,(a,b) -> a+b);

//        Lambda can be replaced with method reference
//        int sumOfElem = numberList
//                .stream()
//                .reduce(0, Integer::sum);

        System.out.println("Sum of All Elements--> " + sumOfElem);


        //OUTPUT: Sum of All Elements--> 103

    }
}
