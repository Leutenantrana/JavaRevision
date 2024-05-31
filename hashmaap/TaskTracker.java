package hashmaap;

import java.util.HashMap;
import java.util.ArrayList;

public class TaskTracker {
    private HashMap<String, ArrayList<Integer>> completedExercises;

    public TaskTracker() {
        this.completedExercises = new HashMap<>();
    }

    public void add(String user, int exercise) {
        this.completedExercises.putIfAbsent(user, new ArrayList<>());

        ArrayList<Integer> complated = this.completedExercises.get(user);
        complated.add(exercise);
    }

    public void print() {
        for (String name : this.completedExercises.keySet()) {
            System.out.println(name + " : " + this.completedExercises.get(name));

        }

    }

    public static void main(String[] args) {
        TaskTracker tracker = new TaskTracker();
        tracker.add("Ada", 3);
        tracker.add("Ada", 4);
        tracker.add("Ada", 3);
        tracker.add("Ada", 3);

        tracker.add("Pekka", 4);
        tracker.add("Pekka", 4);

        tracker.add("Matti", 1);
        tracker.add("Matti", 2);

        tracker.print();
    }

}
