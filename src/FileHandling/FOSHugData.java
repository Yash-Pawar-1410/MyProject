package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class FOSHugData {
    public static void main(String[] args) throws IOException {
        File file = new File("HugeData.txt");
        System.out.println("is file created " + file.createNewFile());
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("wirte operation started at " + startTime);
        for (int i = 0; i < 1000000; i++) {
            fileOutputStream.write('A');
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("wirte operation complete at " + endTime);
        fileOutputStream.close();
        System.out.println("Write operation is complete and stream is closed");
    }
}
