package unit1;

public class ThisReferenceExample {

    public void doProcess(int i, unit1.Process p){
        p.print(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        // Anonymous inner class
        thisReferenceExample.doProcess(2, (int a) -> {
            System.out.println("Value is "+a);

            //System.out.println(this); This will not work
        } );


        // Anonymous inner class
//        thisReferenceExample.doProcess(2, new Unit1.Process() {
//            @Override
//            public void print(int a) {
//                System.out.println("Value is "+a);
//
//                // refer to new Unit1.Process instance inline class
//                System.out.println(this);
//            }
//
//            public String toString(){
//                return "This is a inner class";
//            }
//
//        });
    }

}
