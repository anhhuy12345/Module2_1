package ss3_oop.baitap;

import java.util.Scanner;

public class TestQuadric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input a");
        double a = input.nextDouble();

        System.out.println("Input b");
        double b = input.nextDouble();

        System.out.println("Input c");
        double c = input.nextDouble();

        QuadricAquaction obj = new QuadricAquaction(a,b,c);
        double delta = obj.getDiscriminant();

        if(delta<0) {
            System.out.println("The equation has no root");
        } else if(delta == 0) {
            System.out.println("The equation has same root is: " + obj.getRoot());
        } else {
            System.out.println("The equation has two roots\n x1 = " + obj.getRoot1() + "\n x2 = " + obj.getRoot2());
        }

    }
}
