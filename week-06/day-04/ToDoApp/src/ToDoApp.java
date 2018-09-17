public class ToDoApp {
    private TaskRepository taskRepository;

    public ToDoApp() {
        this.taskRepository = new TaskRepository();
    }

    public void run (String[] args) {
        if (args.length < 1){
            printMenu();
            return;
        }

        if(args[0].equals("-l")) {
            taskRepository.listAll();
            return;
        }

        if(args[0].equals("-a")){
            taskRepository.addTask(args[1]);
        }

        if (args[0].equals("-r")) {
            try {
                taskRepository.removeTask(Long.parseLong(args[1]));
            } catch (IllegalArgumentException e) {
                System.out.println("Can't remove task, there is no task with this index");
            }
            return;
        }

        if (args[0].equals("-c")) {
            try {
                taskRepository.setCompleted(Integer.parseInt(args[1]));
            } catch (IllegalArgumentException e) {
                System.out.println("Can't set task to completed, there is no task with this index");
            }
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
