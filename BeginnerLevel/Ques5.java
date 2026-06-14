package BeginnerLevel;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

//5.Remove Null Values from a List
public class Ques5 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, null, 6);

        System.out.print("List After removing null : ");

//        Using lambda in filter
//        numList.stream()
//                .filter(n -> n!=null)
//                .forEach(n -> System.out.print(n + " "));

//        Using method reference in filter
        numList.stream()
                .filter(Objects::nonNull)
                .forEach(n -> System.out.print(n + " "));

        //OUTPUT: List After removing null : 1 2 6
    }
}
