package BeginnerLevel;

import java.util.Arrays;
import java.util.List;

//16:Return Default Value if Element Not Present
public class Ques16 {

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1, 2, 6, 6, 8, 1);
//      List<Integer> numList = new ArrayList<>();


        int elem=numList
                .stream()
                .filter(n -> n>10)
                .findFirst()
                .orElse(-1);

        System.out.println("Element Greater Than 10: "+ elem);

        //OUTPUT:Element Greater Than 10: -1

    }
}
