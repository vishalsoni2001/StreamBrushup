package BeginnerLevel;
import java.util.Arrays;
import java.util.List;

//11:Remove Duplicate Elements
public class Ques11 {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 6, 6, 8, 1);

        System.out.println("After Removing Duplicate Elements : ");
        numList.stream().distinct().forEach(n -> System.out.print(n + " "));

        //OUTPUT: After Removing Duplicate Elements :
        //1 2 6 8

    }
}
