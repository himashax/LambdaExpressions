package unit3;

import static unit3.MethodReferenceExample2.print;

// For methods with no inout arguments
public class MethodReferenceExample2 {

    public static void main(String[] args) {

        // Method 01...
        // Need to have the Runnable interface implemented :)
/*      PrintRunnable2 printRunnable = new PrintRunnable2();
        Thread thread = new Thread(printRunnable);
        thread.start();
 */

        // Method 02...
        // Instance of printRunnable class
/*      Thread thread = new Thread(new PrintRunnable2());
        thread.start();
 */

        // Method 03...
        // Pass a Runnable anonymous class
/*      Thread thread = new Thread(new Runnable{
            @Override
            public void run() {
                print();
            }
        });
        thread.start();
 */

        // Method 04...
        // Pass as a lambda expression of run method
/*      Thread thread = new Thread(() -> print());
        thread.start();
 */

        // Method 04...
        // convert the lamda expression as method reference
        // No arguments passed and no arguments in the method as well
        // Use the class we are in and the method name without parenthesis
        Thread thread = new Thread( MethodReferenceExample2::print);
        thread.start();

    }

    public static void print(){
        System.out.println("Hello World!");
    }

}

//class PrintRunnable2 implements Runnable{
//
//    @Override
//    public void run() {
//        print();
//    }
//}
