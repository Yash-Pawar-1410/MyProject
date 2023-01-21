package FileHandling;

import java.io.File;
import java.io.IOException;

public class SetPermissionReadOnly {
    public static void main(String[] args) throws IOException {
        File newFile = new File("New File");
        boolean isFileCreated = newFile.createNewFile();
        System.out.println(isFileCreated);
        newFile.setReadOnly();
        System.out.println("set to read only");
    }
}
