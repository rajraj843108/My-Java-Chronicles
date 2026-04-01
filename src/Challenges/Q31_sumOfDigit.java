package Challenges;
import java.util.Scanner;

public class Q31_sumOfDigit {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to sum of digit Calculator:-");
        System.out.print("Enter your number: ");
        int num=sc.nextInt();

        int ans=sumOfDigits(num);
        System.out.println("Sum of digit is: " + ans);

    }

    public static int sumOfDigits(int num){

        int temp;
        int sum=0;
        while (num>0){
            temp=num%10;
            num=num/10;
            sum=sum+temp;
        }
        return sum;
    }

}
