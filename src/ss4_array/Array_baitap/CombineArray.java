package Array.Array_baitap;

import java.util.Arrays;
import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array A");
        int sizeA = input.nextInt();
        int[] arrayA = new int[sizeA];

        for(int i =0; i<sizeA;i++) {
            System.out.println("Input element at " + i);
            arrayA[i] = input.nextInt();
        }
        System.out.println("Input size of array B");
        int sizeB = input.nextInt();
        int[] arrayB = new int[sizeB];

        for(int i =0; i<sizeB;i++) {
            System.out.println("Input element at " + i);
            arrayB[i] = input.nextInt();
        }
        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));

        //Combine to arrayC
        int[] arrayC = new int[sizeA+sizeB];
        for(int i = 0; i<arrayC.length-sizeB;i++) {
            arrayC[i] = arrayA[i];
        }
        System.out.println("Array C after combine with array A: "+Arrays.toString(arrayC));

        for(int i = 0; i<sizeB;i++) {
            arrayC[arrayA.length+i] = arrayB[i];
        }
        System.out.println("Finished: "+Arrays.toString(arrayC));
    }
}
