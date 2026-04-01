package Challenges;
import java.util.Scanner;

public class Q29_sumOfOddNo {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to odd sum:\n");

        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        System.out.println("SUM=" + sumOfOddNumber(num));

    }

    public static int sumOfOddNumber(int num){
        int sum=0;
        int i=1;
        while (i<=num){
            sum=sum+i;
            i=i+2;

        }
        return sum;
    }

}
