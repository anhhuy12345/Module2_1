package test_file.thuchanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileText {
    public void readFileText(String Filepath) {
        try {
            File file = new File(Filepath);
            if (!file.exists()) {
                throw new FileNotFoundException(());
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
                int sum = 0;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    sum += Integer.parseInt(line);
                }
                br.close();
                System.out.println("Tổng = " + sum);
            }
        catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}

