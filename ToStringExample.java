class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}

public class ToStringExample {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("John", 25);

        // Use toString() to get a string representation of the object
        String personString = person.toString();

        // Print the result
        System.out.println("String representation of Person object: " + personString);
    }
}
