package Streamss;

import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;

public class Pro {
    public static void main(String[] args) {
        List<Person> presidents = new ArrayList<>();

        try {
            // reading the "presidents.txt" file line by line
            Files.lines(Paths.get("presidents.txt"))
                    // splitting the row into parts on the ";" character
                    .map(row -> row.split(";"))
                    // deleting the split rows that have less than two parts (we want the rows to
                    // always contain both the name and the birth year)
                    .filter(parts -> parts.length >= 2)
                    // creating persons from the parts
                    .map(parts -> new Person(parts[0], Integer.valueOf(parts[1])))
                    // and finally add the persons to the list
                    .forEach(person -> presidents.add(person));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
