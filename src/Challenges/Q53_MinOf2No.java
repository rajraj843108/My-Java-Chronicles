package Challenges;

import java.util.Scanner;

public class Q53_MinOf2No {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to min no checker:");
        System.out.print("Enter your 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter your 2nd number: ");
        int num2=sc.nextInt();

        int min=num1<num2 ? num1 : num2;
        System.out.println(min + " is Min");

    }
}
