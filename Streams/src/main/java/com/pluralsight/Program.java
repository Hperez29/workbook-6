package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a list of at least 10 people
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Smith", 25));
        people.add(new Person("Alice", "Johnson", 34));
        people.add(new Person("Robert", "Brown", 42));
        people.add(new Person("Emily", "Davis", 29));
        people.add(new Person("Michael", "Miller", 37));
        people.add(new Person("Sarah", "Wilson", 21));
        people.add(new Person("David", "Moore", 45));
        people.add(new Person("Laura", "Taylor", 33));
        people.add(new Person("Daniel", "Anderson", 39));
        people.add(new Person("Olivia", "Thomas", 22));

        // Step 2: Prompt for name to search (first or last)
        System.out.print("Enter a name to search (first or last): ");
        String searchName = scanner.nextLine().trim().toLowerCase();

        List<Person> matchedPeople = new ArrayList<>();
        for (Person p : people) {
            if (p.getFirstName().toLowerCase().equals(searchName) ||
                    p.getLastName().toLowerCase().equals(searchName)) {
                matchedPeople.add(p);
            }
        }

        // Display matched people
        if (matchedPeople.isEmpty()) {
            System.out.println("No people matched the search.");
        } else {
            System.out.println("Matched people:");
            for (Person p : matchedPeople) {
                System.out.println(p);
            }
        }

        // Step 3: Average, min, max age
        int totalAge = 0;
        int oldest = Integer.MIN_VALUE;
        int youngest = Integer.MAX_VALUE;

        for (Person p : people) {
            int age = p.getAge();
            totalAge += age;
            if (age > oldest) oldest = age;
            if (age < youngest) youngest = age;
        }

        double averageAge = totalAge / (double) people.size();
        System.out.printf("Average age: %.2f%n", averageAge);
        System.out.println("Oldest age: " + oldest);
        System.out.println("Youngest age: " + youngest);

        scanner.close();
    }
}