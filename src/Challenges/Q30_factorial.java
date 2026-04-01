package Challenges;
import java.util.Scanner;

public class Q30_factorial {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Factorial!\n");
        System.out.print("Enter your no to find factorial: ");
        int num=sc.nextInt();

        if (num<0){
            System.out.println("Factorial for negative no is not define.");
        } else {

            int fact=1;
            int i=1;
            while (i<=num){
                fact=fact*i;
                i++;
            }
            System.out.println("Factorial is: " + fact);
        }


    }

}
