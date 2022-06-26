public class TypeInference {

    public void getMethod(stringLengthLambda lambdaType){
        System.out.println(lambdaType.getLength("Hello!"));
    }

    public static void main(String[] args) {

        //stringLengthLambda lambdaFunction = (String word) -> word.length();
        stringLengthLambda lambdaFunction = word -> word.length();

        TypeInference typeInference = new TypeInference();

        // We have passed the expression or the behaviour
        // Actual inout value given inside the getMethod method
        typeInference.getMethod(word -> word.length());
    }

}


interface stringLengthLambda{
    int getLength(String word);
}