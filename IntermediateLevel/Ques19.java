package IntermediateLevel;

import java.util.Arrays;
import java.util.List;


//19:Find Maximum Element Using Reduce
public class Ques19 {

    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(1, 22, 32, 6, 18, 4);
        //List<Integer> numberList = new ArrayList<>();

//        int maxElem = numberList
//                .stream()
//                .reduce(1, (a, b) -> Math.max(a,b));

//      OR

        int maxElem = numberList.stream()
                .reduce(Integer::max)
                .orElseThrow(() ->
                        new IllegalArgumentException("List is empty"));


        System.out.println("Max of All Elements--> " + maxElem);

        //OUTPUT: Max of All Elements--> 32

    }
}
