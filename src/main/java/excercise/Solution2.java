package excercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Solution2 {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Himasha", "Mandakini", 23),
                new Person("Lochana", "Mandakini", 14),
                new Person("Sandamali", "Geethika", 24)
        );

        // Step 1: Sort people by lastname
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        // Step 2: Create a method that prints all the elements in the list
        // Print printMethod = p -> System.out.println(p);
        print(people, person -> true, p -> System.out.println(p));

        // Step 3: Create a method that prints all the people that have lastname starts with M
        print(people, person -> (person.getFirstName().startsWith("H")), p -> System.out.println(p.getFirstName()));

    }

//    public static void print(List<Person> personList, Predicate<Person> condition, Print print){
//        for(Person p : personList){
//            if(condition.test(p))
//                print.printMethod(p);
//        }
//    }

    public static void print(List<Person> personList, Predicate<Person> condition, Consumer<Person> print){
        for(Person p : personList){
            if(condition.test(p))
                print.accept(p);
        }
    }

    interface Print{
        public void printMethod(Person p);
    }

}

