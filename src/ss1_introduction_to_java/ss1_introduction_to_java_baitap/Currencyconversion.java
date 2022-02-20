package ss1_introduction_to_java.ss1_introduction_to_java_baitap;

import java.util.Scanner;

public class Currencyconversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the amount of USD to convert: ");
        usd = scanner.nextDouble();
        double exchange = usd * 23000;
        System.out.println("VND value" +" "+ exchange);

    }
}
