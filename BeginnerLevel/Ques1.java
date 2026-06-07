package BeginnerLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//1. Convert List<String> to Uppercase
public class Ques1 {

    public static void main(String[] args) {

        List<String> lowerList = new ArrayList<>(Arrays.asList("mohan", "sohan", "rohan"));

        List<String> upperList = lowerList.stream()
                .map(String::toUpperCase)
                .toList();

        //s -> s.toUpperCase() In map
        for(String s:upperList)
        {
            System.out.print(s + " ");
        }

        //OUTPUT: MOHAN SOHAN ROHAN

    }
}
