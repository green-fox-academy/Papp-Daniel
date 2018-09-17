import java.util.Scanner;

public class testApp {
    private TaskRepository taskRepository;

    public testApp() {
        this.taskRepository = new TaskRepository();
    }

    public void runTestApp(){
        printMenu();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.equals("-a")){
            System.out.println("Type your ToDo");
            String taskToAdd = scanner.nextLine();
            taskRepository.addTask(taskToAdd);
            return;
        }
        if(input.equals("-l")) {
            taskRepository.listAll();
            return;
        }
        if(input.equals("-r")){
            System.out.println("Enter task ID");
            String taskToRemove = scanner.nextLine();
            taskRepository.removeTask(Long.parseLong(taskToRemove));
            return;
        }
        if(input.equals("-c")){
            System.out.println("Enter task ID to set it Completed");
            String taskToComplete = scanner.nextLine();
            taskRepository.setCompleted(Long.parseLong(taskToComplete));
            return;
        }


    }
    private void printMenu() {
        System.out.println("Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                " -l   Lists all the tasks\n" +
                " -a   Adds a new task\n" +
                " -r   Removes an task\n" +
                " -c   Completes an task");
    }
}
