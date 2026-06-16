package BeginnerLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//10.Count Elements Using Collectors
public class Ques10 {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 6, 6, 8, 1);

        Long countOfEle=numList.stream().collect(Collectors.counting());

        System.out.println("Count of Element : " + countOfEle);

        //OUTPUT: Count of Element : 6

    }
}
