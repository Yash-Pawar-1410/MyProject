package FileHandling;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        File folder=new File("New Folder");
        boolean isFolderCreated=folder.mkdir();
        System.out.println(isFolderCreated);
    }
}
