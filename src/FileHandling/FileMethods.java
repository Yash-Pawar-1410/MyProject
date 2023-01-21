package FileHandling;

import java.io.File;

public class FileMethods {
    public static void main(String[] args) {
        File file = new File("New File");
        File file1 = new File("Array");
        // complete pah of the file
        System.out.println(file.getAbsolutePath());
        // path in the current folder or  folder name
        System.out.println(file.getPath());
        // check it is file or not
        System.out.println("is file " + file.isFile());// true
        System.out.println("is file " + file1.isFile());// false (it is a folder)
        // check file is readable or not
        System.out.println("is readable " + file.canRead());//true
        // check file is writeable or not
        System.out.println("is writeable " + file.canWrite());//false

        // check file is executable or not
        System.out.println("is executable " + file.canExecute());//true
        // check file is folder or not
        System.out.println("is folder " + file.isDirectory());// false
        System.out.println("is folder " + file1.isDirectory());//false
    }
}
