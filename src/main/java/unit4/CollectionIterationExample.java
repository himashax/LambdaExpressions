package unit4;

import excercise.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Himasha", "Mandakini", 23),
                new Person("Lochana", "Mandakini", 14),
                new Person("Sandamali", "Geethika", 24)
        );

        System.out.println("Using for loop");
        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }

        System.out.println("Using for in loop");
        for(Person p: people){
            System.out.println(p);
        }

        System.out.println("Using for each loop");
        // For each element in the people list execute what's inside the for each method
        people.forEach(System.out::println);

    }
}
