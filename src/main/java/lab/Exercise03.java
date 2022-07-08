package lab;

import java.util.ArrayList;
import java.util.List;

interface IAverageServices{
    public int getAverage(List<Integer> listOfMarks);
}

public class Exercise03 implements IAverageServices{
    @Override
    public int getAverage(List<Integer> listOfMarks) {
        int total  =0;
        for(Integer mark:listOfMarks){
            total += mark;
        }
        int avg = total/listOfMarks.size();
        return avg;
    }

    public static void main(String[] args) {

        ArrayList<Integer> listOfMarks = new ArrayList<>();
        listOfMarks.add(90);
        listOfMarks.add(80);
        listOfMarks.add(70);
        listOfMarks.add(60);
        listOfMarks.add(100);

        Exercise03 exercise03 = new Exercise03();
        System.out.println("Average is "+ exercise03.getAverage(listOfMarks) + " ...");
    }

}
