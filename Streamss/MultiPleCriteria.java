package Streamss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultiPleCriteria {

    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film("A", 2000));
        films.add(new Film("B", 1999));
        films.add(new Film("C", 2001));
        films.add(new Film("D", 2000));

        System.out.println("Before sorting:");
        for (Film e : films) {
            System.out.println(e);
        }

        Comparator<Film> comparator = Comparator
                .comparing(Film::getReleaseYear)
                .thenComparing(Film::getName);

        Collections.sort(films, comparator);

        System.out.println("\nAfter sorting:");
        for (Film e : films) {
            System.out.println(e);
        }
    }
}

class Film {
    private String name;
    private int releaseYear;

    // Constructor
    public Film(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    // Override toString() for better readability when printing
    @Override
    public String toString() {
        return "Film{name='" + name + "', releaseYear=" + releaseYear + "}";
    }
}
