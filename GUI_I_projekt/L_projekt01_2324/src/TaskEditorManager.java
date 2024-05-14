import java.util.Scanner;

public class TaskEditorManager {
    private NewTask newTask;
    private TaskEditor taskEditor;
    private Scanner scanner;
    private MainManager mainManager;

    public TaskEditorManager(MainManager mainManager) {
        newTask = new NewTask();
        taskEditor = new TaskEditor();
        scanner = new Scanner(System.in);
        this.mainManager = mainManager;
    }
    public void run() {
        boolean running = true;
        while (running) {
            System.out.println(">>>Moduł edycyjny<<<");
            System.out.println("1. Dodaj zadanie");
            System.out.println("2. Edytuj zadanie");
            System.out.println("3. Wyjście");
            System.out.print("Wybierz opcję:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    newTask.createTask(scanner);
                    break;
                case 2:
                    taskEditor.editTask(scanner);
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja, spróbuj ponownie.");
            }
        }
    }
}