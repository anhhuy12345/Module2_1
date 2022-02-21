package ss2_Loop.ss2_Loop_thuchanh;

import java.util.Scanner;

public class InterestCaculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter investment amount: ");
        money = input.nextDouble();
        System.out.println("enter number the month: ");
        month = input.nextInt();
        System.out.println("enter annual interest rate: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0;i < month;i++){
            totalInterest += money *(interestRate/100)/12*month;
        }
        System.out.println("total of interest = "+ " " +totalInterest);

    }
}
