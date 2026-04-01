package Challenges;
import java.util.Scanner;

public class Q38_palindromeNo {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome To Palindrome No. Checker:-");
        System.out.print("Please Enter Your Number: ");
        int num=sc.nextInt();

        int ans=reverseNo(num);
        if (ans==num){
            System.out.println("Given no. is Palindrome");
        } else {
            System.out.println("Given no. is NOT Palindrome");
        }
    }

    public static int reverseNo(int num){
        int newNum=0;
        while (num>0){
            int digit=num%10;
            newNum=newNum*10+digit;
            num=num/10;
        }
        return newNum;
    }

}
