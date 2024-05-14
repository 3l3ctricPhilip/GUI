import java.util.Scanner;

public class MainManager {
    private TaskEditorManager taskEditorManager;
    private TaskChecker taskChecker;
    private Scanner scanner;

    public MainManager() {
        taskEditorManager = new TaskEditorManager(this);
        taskChecker = new TaskChecker();
        scanner = new Scanner(System.in);
    }
    public void run() {
        boolean running = true;
        while (running) {
            System.out.println(">>>System Zarządzania Zadaniami<<<");
            System.out.println("1. Moduł edycyjny");
            System.out.println("2. Moduł sprawdzania zadań");
            System.out.println("3. Wyjście");
            System.out.print("Wybierz opcję:");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    taskEditorManager.run();
                    break;
                case 2:
                    taskChecker.checkTasks(scanner);
                    break;
                case 3:
                    running = false;
                    System.out.println("Koniec programu.");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja, spróbuj ponownie.");
            }
        }
    }
}
