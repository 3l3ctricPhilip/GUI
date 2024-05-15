import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NewTask {

    public void createTask(Scanner scanner) {
        System.out.println("Wprowadź treść zadania (zakończ wprowadzanie używając 'Ctrl+D' na Unix/Linux/Mac lub 'Ctrl+Z' na Windows):");

        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Błąd przy odczycie danych: " + e.getMessage());
        }

        String content = contentBuilder.toString();

        Task task = new Task(content);

        String fileName = addNameOfFile(scanner);

        saveTaskToFile(task, fileName + ".txt");
    }

    private String addNameOfFile(Scanner scanner) {
        System.out.print("Podaj nazwę pliku do zapisania (bez rozszerzenia .txt): ");
        return scanner.nextLine();
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
