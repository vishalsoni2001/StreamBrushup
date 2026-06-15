package BeginnerLevel;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//8:Convert List to Set
public class Ques8 {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 6, 6, 8, 1);

        System.out.println("Before Converting List to Set: ");

        numList.forEach(n-> System.out.print(n + " "));
        System.out.println("");
        System.out.println("After Converting List to Set: ");

        Set<Integer> newNumSet = numList
                .stream()
                .collect(Collectors.toSet());

//        Set<Integer> newNumSet = new HashSet<>(numList);

        newNumSet.forEach(n-> System.out.print(n + " "));

        //OUTPUT: Before Converting List to Set:
        //1 2 6 6 8 1
        //After Converting List to Set:
        //1 2 6 8
    }
}
