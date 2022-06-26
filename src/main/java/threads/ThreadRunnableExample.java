package threads;

// Runnable is an interface with one method
// Can use the same concept for LambdaExpressions (interface with only one method)
// Multiple interfaces can be implemented more advantageous
public class ThreadRunnableExample implements Runnable{
    private int threadNumber;
    public ThreadRunnableExample(int threadNumber){
        this.threadNumber = threadNumber;
    }


    @Override
    public void run() {
        for(int i =1;i<=5;i++){
            System.out.println(i + " Thread "+ threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
