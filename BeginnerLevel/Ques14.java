package BeginnerLevel;

import java.util.Arrays;
import java.util.List;

//14:Skip First 2 Elements
public class Ques14 {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 6, 6, 8, 1);

        System.out.println("After skipping First 2 Elements");
        numList.stream().skip(2)
                .forEach(n -> System.out.print(n + " "));

        //OUTPUT:After skipping First 2 Elements
        //6 6 8 1

    }
}
