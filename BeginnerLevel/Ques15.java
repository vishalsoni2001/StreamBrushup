package BeginnerLevel;

import java.util.Arrays;
import java.util.List;

//15:Handle Null Values Safely
public class Ques15 {
    public static void main(String[] args)
    {
        List<String> nameList= Arrays.asList("vishal",null,"rvi",null,"gold");

        List<String> upperList = nameList.stream()
                .filter(n -> n!=null)
                .map(String::toUpperCase)
                .toList();

        System.out.println("NULL Handling Using Filter:");
        upperList.forEach(System.out::println);

//        OUTPUT:

//        NULL Handling Using Filter:
//        VISHAL
//        RVI
//        GOLD

    }
}
