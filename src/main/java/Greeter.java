public class Greeter {

    // Passing a behaviour to the method
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        //HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        Greeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        Greeting performFunction = () -> System.out.println("Hello World!");
        addLambda addFunction = (int a, int b) -> a + b;

        int a = addFunction.add(2,1);
        System.out.println(a);

    }
}

interface myLambda{
    void function();
}

interface addLambda{
    int add(int a, int b);
}