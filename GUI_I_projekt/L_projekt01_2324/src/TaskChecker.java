import java.io.File;
import java.util.Scanner;

public class TaskChecker {
    public void checkTasks(Scanner scanner) {
        System.out.print("Podaj ścieżkę do folderu z zadaniami: ");
        String folderPath = scanner.nextLine();

        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Podana ścieżka nie jest prawidłowym folderem.");
            return;
        }

        File[] studentFolders = folder.listFiles(File::isDirectory);
        if (studentFolders != null) {
            for (File studentFolder : studentFolders) {
                System.out.println("Student: " + studentFolder.getName());
                File[] taskFolders = studentFolder.listFiles(File::isDirectory);
                if (taskFolders != null) {
                    for (File taskFolder : taskFolders) {
                        System.out.println("  Zadanie: " + taskFolder.getName());
                        File[] taskFiles = taskFolder.listFiles();
                        if (taskFiles != null) {
                            for (File taskFile : taskFiles) {
                                System.out.println("    Plik: " + taskFile.getName());
                            }
                        }
                    }
                }
            }
        }
    }
}
