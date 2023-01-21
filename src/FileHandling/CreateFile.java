package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("Java_Notes.txt");
        boolean isFileCreated = file.createNewFile();
        System.out.println(isFileCreated);
    }
}
