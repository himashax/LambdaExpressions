package unit3;

import excercise.Condition;
import excercise.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample3 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Himasha", "Mandakini", 23),
                new Person("Lochana", "Mandakini", 14),
                new Person("Sandamali", "Geethika", 24)
        );


        // Step 2: Create a method that prints all the elements in the list
        // structure === p -> method(p)
        // One inout argument and use the inout argument in the method

        // System.out -> is an instance
        // println is the method invoked by System.out
        // Separate instance and method itself and write as method reference

        //print(people, person -> true, p -> System.out.println(p));
        print(people, person -> true, System.out::println);
    }

    public static void print(List<Person> personList, Predicate<Person> condition, Consumer<Person> print){
        for(Person p : personList){
            if(condition.test(p))
                print.accept(p);
        }
    }
}
