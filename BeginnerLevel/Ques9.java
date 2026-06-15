package BeginnerLevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//9:Join Strings with Comma Delimiter
public class Ques9 {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Money","Jany","Gokul");

        System.out.println("After Joining Strings with Comma Delimiter");

        String joinedNames=nameList
                .stream()
                .collect(Collectors.joining(","));

        System.out.println(joinedNames);

        //OUTPUT: After Joining Strings with Comma Delimiter
        //Money,Jany,Gokul

    }

}
