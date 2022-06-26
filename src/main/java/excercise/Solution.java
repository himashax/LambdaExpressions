package excercise;

import java.util.*;
import java.util.function.Predicate;

public class Solution {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Himasha", "Mandakini", 23),
                new Person("Lochana", "Mandakini", 14),
                new Person("Sandamali", "Geethika", 24)
        );

        // Step 1: Sort people by lastname
        Collections.sort(people, (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));

        // Step 2: Create a method that prints all the elements in the list
        print(people, person -> true);

        // Step 3: Create a method that prints all the people that have lastname starts with M
        print(people, person -> (person.getFirstName().startsWith("H")));

    }

    public static void print(List<Person> personList, Condition condition){
        for(Person p : personList){
            if(condition.checkCondition(p))
                System.out.println(p.toString());
        }
    }
}

