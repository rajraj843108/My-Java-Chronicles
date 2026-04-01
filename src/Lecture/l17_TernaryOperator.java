package Lecture;

import java.util.Scanner;

public class l17_TernaryOperator {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to greater no. cheker: ");
        System.out.print("Enter 1st Number: ");
        int num1= sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2=sc.nextInt();

//        if (num1>num2){
//            System.out.println(num1 + "is greater Number");
//        } else {
//            System.out.println(num2 + "is greater Number");
//        }


//        int greatNum;
//        if (num1>num2){
//            greatNum=num1;
//        } else {
//            greatNum=num2;
//        }
//        System.out.println(greatNum + " is greater Number");


        int greatNum = num1>num2 ? num1 : num2;
        System.out.println(greatNum + " is greater Number");

    }
}
