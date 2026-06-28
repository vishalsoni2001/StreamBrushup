package IntermediateLevel;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//24:Partition Numbers (>10 and ≤10)
public class Ques24 {
    public static void main(String[] args)
    {
        List<Integer> numList= Arrays.asList(1,91,15,8,6);

        Map<Boolean,List<Integer>> numLessThanGreThan10 = numList
                .stream()
                .collect(Collectors.partitioningBy(n -> n>10));

        System.out.println("List Using Partition by " + numLessThanGreThan10);

        Map<String,List<Integer>> groupedByNumber=numList
                .stream()
                .collect(Collectors.groupingBy(n -> n >10 ? "Greater Than 10" : "Less Than 10"));

        System.out.println("List Using Grouping by " + groupedByNumber);

//        OUTPUT:
//        List Using Partition by {false=[1, 8, 6], true=[91, 15]}
//        List Using Grouping by {Less Than 10=[1, 8, 6], Greater Than 10=[91, 15]}

    }
}
