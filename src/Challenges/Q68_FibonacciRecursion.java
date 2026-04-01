package Challenges;

import java.util.Scanner;

public class Q68_FibonacciRecursion {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Fibonacci series by Recursion");
        System.out.print("Enter no. upto Fibonacci series print: ");
        int num=sc.nextInt();

        for (int i=0;i<num;i++){
            System.out.print(fibRecursion(i) + " ");
        }
    }

    public static long fibRecursion(int num){
        if (num==0) return 0;
        if (num==1) return 1;

        return fibRecursion(num-1) + fibRecursion(num-2);
    }
}
