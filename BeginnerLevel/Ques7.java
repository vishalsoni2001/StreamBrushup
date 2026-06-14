package BeginnerLevel;

import java.util.Arrays;
import java.util.List;

//7.Convert Stream to List
public class Ques7 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 6);

        System.out.print("List After Converting Stream to List : ");

        List<Integer> newNumList = numList
                .stream()
                .map(n -> n * n)
                .toList();

        newNumList.forEach(n-> System.out.print(n + " "));

        //OUTPUT: List After Converting Stream to List : 1 4 36
    }
}
