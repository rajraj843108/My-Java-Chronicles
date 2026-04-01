package Challenges;
import java.util.Scanner;

public class Q12_SimpleInt {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Calcuting Simple Intrest\n");
        System.out.print("Enter Principle amount: ");
        int p=sc.nextInt();
        System.out.print("Enter Rate of Intrest per Year: ");
        int r=sc.nextInt();
        System.out.print("Enter Time Period: ");
        int t=sc.nextInt();
        int si=((p*r*t)/100);
        System.out.println("Your Intrest is: " + si);
    }
}
