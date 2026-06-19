package BeginnerLevel;

import java.util.Arrays;
import java.util.List;

//13:Find First Element
public class Ques13 {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 6, 6, 8, 1);
//      List<Integer> numList = new ArrayList<>();


       int elem=numList
               .stream()
               .findFirst()
               .orElseThrow(() -> new RuntimeException("No Element Found"));

        System.out.println("First Element : "+ elem);

        //OUTPUT:First Element : 1

    }
}
