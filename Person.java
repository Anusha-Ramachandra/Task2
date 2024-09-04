public class Person {
    // Attributes of the Person class
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters for the Person class attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
