package ss1_introduction_to_java.ss1_introduction_to_java_thuchanh;

import java.util.Scanner;

public class LinerEquaction {
    public static void main(String[] args) {
        System.out.println("linear Equation Resolvers");
        System.out.println("given a equation as 'a * x + b = c', please enter constants: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0){
            double answer = (c - b)/a;
            System.out.println("Equation pass with x = %f!\n" + answer);
        }else {
            if (b==c) {
                System.out.println("the solution is all x!");
            }else {
                System.out.println("no solution!");
            }
        }
    }
}
