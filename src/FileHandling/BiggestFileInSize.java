package FileHandling;

import java.io.File;

public class BiggestFileInSize {
    public static void main(String[] args) {
        File folder= new File("src/FileHandling");
        File [] file=folder.listFiles();
        File biggestFile=file[0];
        for (File file1: file){
            if (biggestFile.length() < file1.length()){
                biggestFile=file1;
            }
            System.out.println(file1.getName()+"\t"+file1.length());
        }
        System.out.println("----------------------------------");
        System.out.println("biggest file is "+biggestFile.getName()+"\t"+biggestFile.length());
    }
}
