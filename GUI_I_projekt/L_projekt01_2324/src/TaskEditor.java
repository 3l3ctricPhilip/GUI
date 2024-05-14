import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class TaskEditor {
    public void editTask(Scanner scanner) {
        System.out.println("Wprowadź treść zadania:");
        String content = scanner.nextLine();
        Task task = new Task(content);

        System.out.print("Podaj nazwę pliku do zapisania: ");
        String filename = scanner.nextLine();

        saveTaskToFile(task, filename);
    }

    private void saveTaskToFile(Task task, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(task);
            System.out.println("Zadanie zapisane do pliku: " + filename);
        } catch (IOException e) {
            System.out.println("Błąd przy zapisywaniu zadania: " + e.getMessage());
        }
    }
}
