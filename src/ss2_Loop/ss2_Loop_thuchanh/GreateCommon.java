package ss2_Loop.ss2_Loop_thuchanh;

import java.util.Scanner;

public class GreateCommon {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a: ");
        a = input.nextInt();
        System.out.println("enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0 || b==0){
            System.out.println("no greatest common factor");
        }
        while (a!= b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        System.out.println("Greatest common factor: " + a);
    }
}
