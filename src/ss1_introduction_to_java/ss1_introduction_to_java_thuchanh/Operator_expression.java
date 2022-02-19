package ss1_introduction_to_java.ss1_introduction_to_java_thuchanh;

import java.util.Scanner;

public class Operator_expression {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width: ");
        width = scanner.nextFloat();
        System.out.println("enter height: ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("area = " + area);
    }
}
