package com.pluralsight;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a list of at least 10 people
        List<Person> people = Arrays.asList(
                new Person("John", "Smith", 25),
                new Person("Alice", "Johnson", 34),
                new Person("Robert", "Brown", 42),
                new Person("Emily", "Davis", 29),
                new Person("Michael", "Miller", 37),
                new Person("Sarah", "Wilson", 21),
                new Person("David", "Moore", 45),
                new Person("Laura", "Taylor", 33),
                new Person("Daniel", "Anderson", 39),
                new Person("Olivia", "Thomas", 22)
        );

        // Step 1: Search names using stream + filter
        System.out.print("Enter a name to search (first or last): ");
        String searchName = scanner.nextLine().trim().toLowerCase();

        List<Person> matchedPeople = people.stream()
                .filter(p -> p.getFirstName().equalsIgnoreCase(searchName) ||
                        p.getLastName().equalsIgnoreCase(searchName))
                .collect(Collectors.toList());

        if (matchedPeople.isEmpty()) {
            System.out.println("No people matched the search.");
        } else {
            System.out.println("Matched people:");
            matchedPeople.forEach(System.out::println);
        }

        // Step 2: Average age using map + reduce
        int totalAge = people.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum);

        double averageAge = totalAge / (double) people.size();
        System.out.printf("Average age: %.2f%n", averageAge);

        // Step 3: Oldest and youngest using sorted
        Optional<Person> oldest = people.stream().max(Comparator.comparingInt(Person::getAge));

        Optional<Person> youngest = people.stream().min(Comparator.comparingInt(Person::getAge));

        System.out.println("Oldest age: " + (oldest.map(Person::getAge).orElse(-1)));
        System.out.println("Youngest age: " + (youngest.map(Person::getAge).orElse(-1)));

        scanner.close();
    }
}