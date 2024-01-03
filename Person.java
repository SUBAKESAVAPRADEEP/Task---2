package Pradeep;



public class Person {
    private String name;
    private int age;

    // Constructor with name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with only name (default age is 18)
    public Person(String name) {
        this(name, 18);
    }

    // Method to display name and age
    public void displayInfo() {
        System.out.println("Name: "  + name);
        System.out.println("Age: "  + age);

//Creating a Person object with name and age
        Person person1 = new Person("John", 25);

// Displaying the name and age
        person1.displayInfo();
        // Creating a Person object with only the name
        Person person2 = new Person("Alice");

// Displaying the name and age
        person2.displayInfo();
    }}