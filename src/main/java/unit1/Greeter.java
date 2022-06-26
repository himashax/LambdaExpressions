package unit1;

public class Greeter {

    // Passing a behaviour to the method
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        //Unit1.HelloWorldGreeting helloWorldGreeting = new Unit1.HelloWorldGreeting();
        // Created a new class and implemented the method
        Greeting helloWorldGreeting = new HelloWorldGreeting();

        // An innerclass that
        Greeting anonymousClass = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World");
            }
        };

        // Just implemented the method
        Greeting performFunction = () -> System.out.println("Hello World!");

        // Type inference
        // Try to match the expression with the greeting interface argument in the greet method
        greeter.greet(() -> System.out.println("Hello World"));

    }
}

//interface myLambda{
//    void function();
//}

//        greeter.greet(anonymousClass);
//        greeter.greet(performFunction);