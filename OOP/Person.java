package OOP;

public class Person {
    private String name;
    private int age;
    private Double height;
    private Double weight;

    public Person(String name) {
        this(name, 0, 0.0, 0.0);
    }

    public Person(String name, int age, Double height, Double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

    }

    public void advanceAge() {
        this.age = this.age + 1;
    }

    public Double bmi() {
        return this.weight / (this.height * this.height);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }

    public String toString() {
        return this.name + ", BMI: " + this.bmi() + ", maximum heart rate: " + this.maximumHeartRate();
    }
}
