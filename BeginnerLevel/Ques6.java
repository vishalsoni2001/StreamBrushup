package BeginnerLevel;

import java.util.Arrays;
import java.util.List;

//6:Square Only Even Numbers
public class Ques6 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 4, 6);

        System.out.print("Square of even number in list : ");

        numList.stream()
                .filter(n -> n%2==0)
                .map(n -> n*n)
                .forEach(n -> System.out.print(n + " "));

        //OUTPUT: Square of even number in list : 4 16 36
    }
}
