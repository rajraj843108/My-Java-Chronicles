package Challenges;
import java.util.Scanner;

public class Q13_CompoundInt {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calcluting Compound Intrest:\n");
        System.out.print("Enter Principle amount: ");
        int p=sc.nextInt();
        System.out.print("Enter Rate of Intrest per Year: ");
        double r=sc.nextDouble();
        System.out.print("Enter Time Period: ");
        int t=sc.nextInt();
        double amout= p * Math.pow((1+ r/100),t);
        double ci= amout-p;

        System.out.println("Your Total amount: " + amout);
        System.out.println("Your Intrest is: " + ci);
    }
}
