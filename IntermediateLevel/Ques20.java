package IntermediateLevel;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//20:Sort Integers in Ascending Order
public class Ques20 {
    public static void main(String[] args)
    {
        List<Integer> numList = Arrays.asList(11,23,6,5,9);

        System.out.println("List After Sorting in ascending order");
        numList.stream()
                .sorted()
                .forEach(n -> System.out.print(n + " "));

        //By default sorted() method sort in ascending order

        System.out.println(" ");
        System.out.println("List After Sorting in descending order");

        numList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + " "));

        //OUTPUT: List After Sorting in ascending order
        //5 6 9 11 23
        //List After Sorting in descending order
        //23 11 9 6 5
    }
}
