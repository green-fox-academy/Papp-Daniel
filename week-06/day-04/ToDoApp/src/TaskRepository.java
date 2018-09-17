import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.toIntExact;
import static java.time.LocalDate.now;

public class TaskRepository {
    private List<Task> tasks;
    private FileReader reader;
    private FileWriter writer;

    public TaskRepository() {
        this.tasks = new ArrayList<>();
        this.reader = new FileReader();
        this.writer = new FileWriter();

    }

    public void addTask(String task) {
        List<Task> tasks = findAll();
        long id = 1;
        for (Task task1 : tasks) {
            id++;
        }
        tasks.add(new Task(id, task, false));
        writer.writeTasks(tasks);
    }

    public List<Task> findAll() {
        return reader.loadTasks();
    }

    public void listAll() {
        List<Task> taskList = findAll();

        for (Task task : taskList) {
            if (taskList.size() == 0) {
                System.out.println("No ToDo today!");
            } else {
                System.out.println(task);
            }
        }
    }

    public void removeTask(long id) {
        List<Task> taskList = findAll();
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).getId() == id) {
                taskList.remove(i);
                i--;
                writer.writeTasks(taskList);
            }
        }

    }

    public void setCompleted(long id) {
        List<Task> taskList = findAll();
        for (Task task : taskList) {
            if (task.getId() == id) {
                task.setCompleted(true);
                task.setComplatedAt(now());
                writer.writeTasks(taskList);
            }
        }

    }
}
