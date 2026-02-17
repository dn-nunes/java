public class Main {
    static void main() {
        var tm = new TaskManager();
        var t1 = new Task("Estudar Java", TaskStatus.Doing, tm);
        var t2 = new Task("Planejamento financeiro", TaskStatus.ToDo, tm);
        var t3 = new Task("Planejamento quarto", TaskStatus.ToDo, tm);
        var t4 = new Task("Estudar banco de dados", TaskStatus.ToDo, tm);

        tm.ShowTasks();

        t1.changeStatus(TaskStatus.Done);
        t4.changeStatus(TaskStatus.Doing);

        tm.ShowTasks();
    }
}
