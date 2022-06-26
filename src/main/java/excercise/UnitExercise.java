package excercise;

import java.util.*;

public class UnitExercise {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Himasha", "Mandakini", 23),
                new Person("Lochana", "Mandakini", 14),
                new Person("Sandamali", "Geethika", 24)
        );

        // Step 1: Sort people by lastname
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        // Step 2: Create a method that prints all the elements in the list
        print(people, new Condition() {
            @Override
            public boolean checkCondition(Person person) {
                return true;
            }
        });

        // Step 3: Create a method that prints all the people that have lastname starts with M
        print(people, new Condition() {
            @Override
            public boolean checkCondition(Person person) {
                if(person.getLastName().startsWith("G")) return true;
                else return false;
            }
        });

    }

//    public static void printAll(List<Person> personList){
//        for(Person p : personList){
//            System.out.println(p.toString());
//        }
//    }

    public static void print(List<Person> personList, Condition condition){
        for(Person p : personList){
            if(condition.checkCondition(p))
                System.out.println(p.toString());
        }
    }

}
