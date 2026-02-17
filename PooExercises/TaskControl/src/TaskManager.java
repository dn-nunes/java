import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void ShowTasks() {
        System.out.println("Tarefas:");

        for (Task task : tasks) {
            System.out.println("- " + task);
        }

        System.out.println();
    }
}
