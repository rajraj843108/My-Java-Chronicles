package Challenges;

import java.util.Scanner;

public class Q66_SumPositiveByContinue {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to addition of positive number:");
        int numArr[]=ArrayInput.Utility();

        int sum=0;
        for (int num:numArr){
            if (num<0){
                continue;
            }
            sum=sum+num;
        }

        System.out.println("Sum of positive no. is: " + sum);
    }
}
