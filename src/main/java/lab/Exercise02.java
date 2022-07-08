package lab;

import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface ICalculateService{
    public int calculateTotal(List<Integer> listOfMarks);
}

public class Exercise02{

    public static void main(String[] args) {

        ICalculateService calculateService = listOfMarks -> listOfMarks.stream().mapToInt(Integer::intValue).sum();

        List<Integer> list = Arrays.asList(10, 20,30,40,50,12);

        System.out.println(calculateService.calculateTotal(list));

    }
}
