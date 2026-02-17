public class Task {
    private String description;
    private TaskStatus status;

    public Task(String description, TaskStatus status, TaskManager tm) {
        this.description = description;
        this.status = status;

        tm.addTask(this);
    }

    public void changeStatus(TaskStatus status) {
        this.status = status;
        System.out.println("Status alterado com sucesso!");
    }

    @Override
    public String toString() {
        return String.format("%s | %s", status, description);
    }
}
