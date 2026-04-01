package Challenges;

import java.util.Scanner;

public class Q67_EvenByContinue {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to printing even number:");
        System.out.print("Please enter your no. upto print: ");
        int num=sc.nextInt();
        System.out.print("Even no. is: ");

        for (int i=1;i<=num;i++){
            if (i%2==1){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
