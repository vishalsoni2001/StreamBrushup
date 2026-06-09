package BeginnerLevel;

import java.util.Arrays;
import java.util.List;

//3.Count Numbers Greater Than 10
public class Ques3 {
    public static void main(String[] args) {

        List<Integer> numberList= Arrays.asList(11,21,33,6,18,14);

        long numGreaterThan10 = numberList
                .stream()
                .filter(n -> n > 10)
                .count();

        System.out.println("numGreaterThan10--> " + numGreaterThan10);


        //OUTPUT: numGreaterThan10--> 5

    }
}
