package IntermediateLevel;

import java.util.Arrays;
import java.util.List;

//18.Find Product of All Elements
public class Ques18 {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1, 2, 3, 6, 8, 4);

        int prodOfElem = numberList
                .stream()
                .reduce(1, (a, b) -> a * b);


        System.out.println("Prod of All Elements--> " + prodOfElem);


        //OUTPUT: Prod of All Elements--> 1152

    }
}