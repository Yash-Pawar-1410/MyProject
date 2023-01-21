package FileHandling;

import java.io.File;

public class TotalFilesInFolder {
    public static void main(String[] args) {
        File folder=new File("src/FileHandling");
        // check it is a folder or not
        System.out.println("is a folder "+folder.isDirectory());
        String [] fileName= folder.list();
        System.out.println("total files available in the folder "+fileName.length);
        for (String fileNames:fileName) {
            System.out.println(fileNames);
        }
    }
}
