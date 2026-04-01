package Lecture;

import java.util.Scanner;

public class l10_ReturnMethod {
    static void main(String[] args) {
        int a=readNumber();
        int b=readNumber();

        int sum=a+b;
        System.out.println("Sum of the no is: " + sum);

    }


    public static int readNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number:");
        int num=sc.nextInt();
        return num;
    }



}
