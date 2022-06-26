package threads;

public class ThreadClass extends Thread{

    private int threadNumber;
    public ThreadClass(int threadNumber){
        this.threadNumber = threadNumber;
    }


    @Override
    public void run() {
        for(int i =1;i<=5;i++){
            System.out.println(i + " Thread "+ threadNumber);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
