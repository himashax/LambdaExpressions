package unit1;

public class Closure {

    public static void main(String[] args) {

        // Consider as a final keyword
        int b = 20;

        printNo(2, new Process() {
            @Override
            public void print(int a) {
                System.out.println(a + b);
            }
        });
    }

    public static void printNo(int a, Process process){
        process.print(a);
    }
}

interface Process{
    public void print(int a);
}
