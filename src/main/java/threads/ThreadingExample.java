package threads;

public class ThreadingExample {

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            ThreadRunnableExample threadRunnableExample = new ThreadRunnableExample(i);
            Thread thread = new Thread(threadRunnableExample);
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

//        ThreadClass threadClass = new ThreadClass();
//        ThreadClass threadClass2 = new ThreadClass();
//
//        threadClass.start();
//        threadClass2.start();
    }

}
