package Challenges;

import java.util.Scanner;

public class Q58_CalculatorSwitch {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.print("Enter 1st number: ");
        int num1=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=sc.nextInt();
        System.out.print("Enter operation you performed: ");
        String opt=sc.next();

        int ans=switch (opt){
            case "+" -> num1+num2;
            case "-" -> num1-num2;
            case "*" -> num1*num2;
            case "/" -> num1/num2;
            case "%" -> num1%num2;
            default -> -1;
        };
        System.out.println(ans);

    }
}
