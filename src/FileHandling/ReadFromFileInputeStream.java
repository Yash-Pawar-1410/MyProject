package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// we use FileOutputStream class to write to a file in the terms of bytes

public class ReadFromFileInputeStream { //OutputStreamū
    public static void main(String[] args) throws IOException {
        File file = new File("Hello.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        int read= fileInputStream.read();
        while (read!=-1){
            System.out.print((char) read+" ");
            read= fileInputStream.read();
        }
        fileInputStream.close();
    }
}
