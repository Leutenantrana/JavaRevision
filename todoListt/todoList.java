package todoListt;

import java.util.ArrayList;

public class todoList {
    private ArrayList<String> list;

    public todoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        this.list.add(task);
    }

    public void print() {
        int i = 0;
        for (String task : list) {
            System.out.println(i + 1 + " : " + task);
            i++;
        }
    }

    public void remove(int number) {
        int num = number - 1;
        this.list.remove(num);
    }

}
