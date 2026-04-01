package Challenges;

import java.util.Scanner;

public class Q72_AreaCircumference {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to finding area of circumference of circle:");
        System.out.print("Please enter Radius of your circle: ");
        double rad=sc.nextDouble();
        double p=Math.PI;
        double cir=2*p*rad;
        System.out.printf("Circumference of circle is: %f",cir);
    }

}
