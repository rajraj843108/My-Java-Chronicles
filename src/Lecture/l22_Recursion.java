package Lecture;

import java.util.Scanner;

public class l22_Recursion {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to factorial calculator:");
        System.out.print("Enter your number: ");
        int num=sc.nextInt();

        long ans=factorial(num);
        System.out.println("Fact is: "+ans);
    }


    public static long factorialite(int num) {
        long fact=1;
        for (int i=1;i<=num;i++){
            fact *=i;
        }
     //   System.out.print("Factorial is: " + fact);
        return fact;
    }


    public static long factorial(int num){

        if (num==1){
            return 1;
        }

        return num * factorial(num-1);
    }
}







