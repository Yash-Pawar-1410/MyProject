package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

// we use FileOutputStream class to write to a file in the terms of bytes

public class WriteToFileOutputStream { //OutputStreamū
    public static void main(String[] args) throws IOException {
        File file = new File("Hello.txt");
        System.out.println(file.createNewFile());
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        byte[] bytes = {65, 66, 67, 68, 69, 70, 71, 72, 73};
        fileOutputStream.write(bytes);
        System.out.println("Write operation done");
        fileOutputStream.close();
    }
}
