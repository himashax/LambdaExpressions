package examples;


public class LambdaExample01 {

    // method signature
   // 1. access modifier
    // 2. return type
    // 3. input arguments
    public static void display(){
        System.out.println("Hello World");
    }

    public int add1(){
        return 2+2;
    }

    public int add2(int a , int b){
        return a+b;
    }


    public String sayHello(String name){
        return "Hello " + name;
    }



    public static void main(String[] args) {

        int age = 10;
        int[] numarray = {0,1,2};

        LambdaInterface01  lambdaVariable =  () -> System.out.println("Hello World");

        //AddNumbers addNumbersLambda1 =   () -> 2+2;

        AddNumbers addNumbersLambda2 = (a , b) -> a+b;


        Hello helloLambda =  name -> "Hello " + name;


        lambdaVariable.displayAnyName();
        helloLambda.sayHello("Malak");

        display();


    }

}

interface Hello{

    public String sayHello(String name);

}
