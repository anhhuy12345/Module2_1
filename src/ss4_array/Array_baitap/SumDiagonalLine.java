package Array.Array_baitap;

import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] array = {
                {1,2,3,4},
                {11,12,27,14},
                {21,11,23,24},
                {35,32,33,34},
        };
        sumDiagonal1(array);

        System.out.println("Input size");
        int size = input.nextInt();

        double[][] array2 = new double[size][size];
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++) {
                System.out.println("Input element at [" +i + "]["+j+"]");
                array2[i][j] = input.nextInt();
            }
        }
        sumDiagonal2(array2);
    }

    static void sumDiagonal1(double[][] array) {
        int sum=0;
        for(int i = 0;i<array.length;i++) {
            sum+= array[i][i];
        }
        System.out.println("Sum of diagonal elements is " + sum);
    }

    static void sumDiagonal2(double[][] array) {
        int sum=0;
        int j = array.length-1;
        for(int i = 0;i<array.length;i++) {
            sum+= array[i][j-i];
        }
        System.out.println("Sum of diagonal elements is " + sum);
    }
}
