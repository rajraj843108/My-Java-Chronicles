package Challenges;

import java.util.Scanner;

public class Q69_PalindromeRecursion {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome To Palindrome No. Checker:-");
        System.out.print("Please Enter Your Number: ");
        String str=sc.next();
        System.out.println("Your String is " + (isPalindrome(str) ? "Palindrome" : "NOT Palindrome"));
    }

    public static boolean isPalindrome(String str){
        if (str.length()<=1){
            return true;
        }

        int lastpos=str.length()-1;
        if (str.charAt(0) != str.charAt(lastpos)){
            return false;
        }

        String newStr=str.substring(1,lastpos);

        return isPalindrome(newStr);
    }
}

