package Streamss;

public class Person {
    private String name;
    private int birthYear;

    // Constructor
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    // Override toString() for better readability when printing
    @Override
    public String toString() {
        return "Person{name='" + name + "', birthYear=" + birthYear + "}";
    }
}
