package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SetPermissionWriteOnly {
    public static void main(String[] args) throws IOException {
        File newFile =new File("WriteOnly");
        boolean isFileCreated=newFile.createNewFile();
        System.out.println(isFileCreated);
        newFile.setWritable(true);
        System.out.println("set to write");
    }
}
