package serialization.thuchanh;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static serialization.thuchanh.FileBinary.copyFileUsingJava7File;

public class TestFileBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.println("Enter destination file:");
        String destPath = in.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try{
            copyFileUsingJava7File(sourceFile, destFile);
            System.out.printf("Copy complete");
        }catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }
}
