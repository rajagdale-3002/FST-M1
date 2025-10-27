import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) {
        try {
            // Create file object
            File file = new File("C:/User stories/User story 2025/Sprint 18/Java-txt-file.txt");

            // Create file if it doesn't exist
            boolean fStatus = file.createNewFile();
            if (fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            // Write to the file
            FileUtils.writeStringToFile(file, "Random text inserted in this file ", Charset.defaultCharset());

            // Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(file, "UTF-8"));

            // Create destination directory
            File destDir = new File("C:/User stories/User story 2025/Sprint 18/JavaUtil_folder");
            destDir.mkdirs(); // Ensure directory exists

            // Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            // Get file from new directory
            File newFile = FileUtils.getFile(destDir, "Java-txt-file.txt");

            // Read data from copied file
            String newFileData = FileUtils.readFileToString(newFile, "UTF-8");

            // Print copied file data
            System.out.println("Data in new file: " + newFileData);

        } catch (IOException errMessage) {
            System.out.println("Error: " + errMessage.getMessage());
        }
    }
}