package FileHandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;

public class BOSHugData {

    public static void main(String[] args) throws IOException {

        File file = new File("Huge Data.txt");
        System.out.println("is file created " + file.createNewFile());
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        LocalDateTime startTime = LocalDateTime.now();
        System.out.println("wirte operation started at " + startTime);
        for (int i = 0; i < 1000000; i++) {
            bufferedOutputStream.write('A');
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("wirte operation complete at " + endTime);
        bufferedOutputStream.close();
        System.out.println("Write operation is complete and stream is closed");

    }


}
