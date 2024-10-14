import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ToDoList {
    PriorityQueue<Task> taskQueue;

    public ToDoList() {
        this.taskQueue = new PriorityQueue<>();

    }

    public void add(Importance importance, int priority, String description) {
        taskQueue.add(new Task(importance, priority, description));
    }

    public boolean isEmpty() {
        if (taskQueue.isEmpty()) {
            return true;
        }
        return false;
    }

    public String remove() {
        Task taskQueue = this.taskQueue.poll();
        return taskQueue.getImportance() + " " + String.valueOf(taskQueue.getPriority()) + " " + taskQueue.getDescription();
    }
}
