package unit3;

import static unit3.MethodReferenceExample1.print;

public class MethodReferenceExample1 {

    public static void main(String[] args) {

        PrintRunnable printRunnable = new PrintRunnable();
        Thread thread = new Thread(printRunnable);
        thread.start();

    }

    public static void print(){
        System.out.println("Hello!");
    }

}

class PrintRunnable implements Runnable{

    @Override
    public void run() {
        print();
    }
}