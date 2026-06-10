package BeginnerLevel;

import java.util.Arrays;
import java.util.List;


//4.Find Names Starting with "A"
public class Ques4 {
    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Mohan", "Aryan", "Aman");
        nameList.stream()
                .filter(n -> n.startsWith("A"))
                .toList()
                .forEach(n -> System.out.print(n + " "));

        //OUTPUT: Aryan Aman
    }
}
