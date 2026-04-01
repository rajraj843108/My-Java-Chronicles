package Challenges;

import java.util.Scanner;

public class Q61_MultiplicationTable {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to multiplication table: ");
        System.out.print("Enter your no for printing table: ");
        int num=sc.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println((num) + "x" + (i) + "=" + i*num);
        }

    }
}
