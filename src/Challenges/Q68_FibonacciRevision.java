package Challenges;

import java.util.Scanner;

public class Q68_FibonacciRevision {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Fibonacci series by Recursion");
        System.out.print("Enter no. upto Fibonacci series print: ");
        int num=sc.nextInt();
        System.out.println("Fibonacci series of "+num+" is:");
        Fibonacci(num);
    }

    public static void Fibonacci(int num){
        if (num<0) return;
        System.out.print("0 ");
        if (num==0)return;
        System.out.print("1 ");

        int first=0;
        int second=1;
        while (first+second<=num){
            int third=first+second;
            System.out.print(third+" ");
            first=second;
            second=third;
        }

//        int first=0;
//        int second=1;
//        for (int i=1;i<num;i++){
//            int third=first+second;
//            System.out.print(third+" ");
//            first=second;
//            second=third;
//
//        }


    }

}
