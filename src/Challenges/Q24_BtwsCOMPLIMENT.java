package Challenges;
import java.util.Scanner;

public class Q24_BtwsCOMPLIMENT {

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("To Perform Bitwise COMPLIMENT:");
        System.out.print("Enter Your no.");

        int num1=sc.nextInt();


        int ans= ~num1;
        System.out.println("Bitwise COMPLIMENT of given no. is: "+ans);

    }

}
