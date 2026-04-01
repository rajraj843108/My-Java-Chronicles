package Challenges;
import java.util.Scanner;

public class Q35_reverseTheDigit {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to Reverse The Digit");
        System.out.print("Enter Your Number:");
        int num=sc.nextInt();

        int ans=reverseDigit(num);
        System.out.println("Reverse Digit is:" + ans);
    }

    public static int reverseDigit(int num){
        int newNum=0;
        while (num>0){
            int digit=num%10;
            newNum=newNum * 10 + digit;
            num=num/10;
        }
        return newNum;
    }

    public static int sumDigit(int num){
        int sum=0;
        while (num>0){
            int digit=num%10;
            sum=sum + digit;
            num=num/10;
        }
        return sum;
    }

}
