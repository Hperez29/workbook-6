package com.pluralsight;

    public static void main(String[] args) {
        // Create a FixedList for Strings with max size of 3
        FixedList<String> names = new FixedList<>(3);
        System.out.println("== Adding names ==");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana"); // This should fail
        System.out.println("Names list: " + names);

        // Create a FixedList for Integers with max size of 2
        FixedList<Integer> numbers = new FixedList<>(2);
        System.out.println("\n== Adding numbers ==");
        numbers.add(10);
        numbers.add(20);
        numbers.add(30); // This should fail
        System.out.println("Numbers list: " + numbers);

        // Create a FixedList for Doubles with max size of 1
        FixedList<Double> decimals = new FixedList<>(1);
        System.out.println("\n== Adding decimals ==");
        decimals.add(3.14);
        decimals.add(2.71); // This should fail
        System.out.println("Decimals list: " + decimals);
    }
}