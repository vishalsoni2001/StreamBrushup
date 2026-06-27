package IntermediateLevel;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//23:Group Numbers into Even and Odd
public class Ques23 {
    public static void main(String[] args)
    {
        List<Integer> numList = Arrays.asList(11,23,6,5,9);

        Map<String,List<Integer>> groupedByNumber=numList
                .stream()
                .collect(Collectors.groupingBy(n -> n %2==0 ? "Even" : "Odd"));

        System.out.println("List Using Grouping By " + groupedByNumber);

        Map<Boolean,List<Integer>> partitionByNumber=numList
                .stream()
                .collect(Collectors.partitioningBy(n -> n %2==0 ));

        System.out.println("List Using Partition By " + partitionByNumber);


//        OUTPUT:
//        List Using Grouping By {Even=[6], Odd=[11, 23, 5, 9]}
//        List Using Partition By {false=[11, 23, 5, 9], true=[6]}


//        Use groupingBy() when there can be multiple groups (e.g., grouping employees by department).
//        Use partitioningBy() when there are exactly two groups based on a boolean condition (e.g., even/odd, pass/fail, active/inactive).





    }
}
