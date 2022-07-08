package lab;

import java.util.stream.IntStream;

public class Exercise04 {
    public static void main(String[] args) {

        System.out.println("Threads new approach");
        new Thread(() ->  IntStream.iterate(0, i -> i + 1).limit(10).forEach(i -> System.out.println(i))).start();
    }
}
