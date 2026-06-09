package BeginnerLevel;

import java.util.Arrays;
import java.util.List;

//2. Filter Even Numbers
public class Ques2 {

    public static void main(String[] args) {

        List<Integer> numberList= Arrays.asList(1,2,3,6,8,4);

        numberList
                .stream()
                .filter(n -> n%2==0)
                .forEach(n-> System.out.print(n + " "));


        //OUTPUT:2 6 8 4

    }


}
