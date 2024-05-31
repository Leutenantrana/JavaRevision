package Inheritancee;

public class Student extends Person {
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public void study() {
        this.credits += 1;
    }

    public int credits() {
        return this.credits;
    }

    public String toString() {
        return super.toString() + " \n" + "Study Credits: " + this.credits();
    }

    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits " + ollie.credits());
    }
}
