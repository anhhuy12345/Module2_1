package Array.Array_baitap;

import java.util.Scanner;

public class SumCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Input column to calculate");
        int colNo = input.nextInt();
        sumColumn(array,colNo);

        System.out.println("Input row");
        int row = input.nextInt();
        System.out.println("Input col");
        int col = input.nextInt();

        int[][] array2 = new int[row][col];
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                System.out.println("Input element at [" +i + "]["+j+"]");
                array2[i][j] = input.nextInt();
            }
        }
        System.out.println("Input column to calculate");
        int colNo2 = input.nextInt();
        SumCol.sumColumn(array2,colNo2);
    }

    static void sumColumn(int[][] array,int col) {
        int sum = 0;
        for(int i = 0; i<array.length;i++) {
            sum+= array[i][col];
        }
        System.out.println("Total element at column " + col + " is " + sum);
    }
}
