package BeginnerLevel;

import java.util.Arrays;
import java.util.List;

//12:Get First 3 Elements
public class Ques12 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 6, 6, 8, 1);

        System.out.println("First 3 Elements : ");
        numList.stream()
                .limit(3)
                .forEach(n -> System.out.print(n + " "));

        //OUTPUT: First 3 Elements :
        //1 2 6

    }
}
