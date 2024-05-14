import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NewTask {

    public void createTask(Scanner scanner) {
        System.out.println("Wprowadź treść zadania (zakończ wprowadzanie używając 'Ctrl+D' na Unix/Linux/Mac lub 'Ctrl+Z' na Windows):");

        StringBuilder contentBuilder = new StringBuilder();
        String line;
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            contentBuilder.append(line).append(System.lineSeparator());
        }
        scanner.close();
        String content = contentBuilder.toString();


        Task task = new Task(content);

        Scanner fileScanner = new Scanner(System.in);
        System.out.print("Podaj nazwę pliku do zapisania (bez rozszerzenia .txt): ");
        String filename = fileScanner.nextLine();
        fileScanner.close();

        saveTaskToFile(task, filename + ".txt");
    }

    private void saveTaskToFile(Task task, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(task.getContent());
            System.out.println("Zadanie zapisane do pliku: " + filename);
        } catch (IOException e) {
            System.out.println("Błąd przy zapisywaniu zadania: " + e.getMessage());
        }
    }
}
