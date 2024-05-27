
// arraylist are used to store list of elements of a particular type

import java.util.ArrayList;
import java.util.Scanner;

// public class Program{
//     public static void main(String[] args) {
//         ArrayList<String> stringaLista = new ArrayList<>()
//     }
// }

// when we declare the value that a list can hold the first letter is always capitalised
// Variables in Java are categorised into two categories Value type and Reference type

// ArrayList<Integer> list = new ArrayList<>();

public class ArrayListt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(12);
        list.add(1);
        list.add(5);
        System.out.println(list);
        list.remove(Integer.valueOf(12));
        System.out.println(list);

    }

}