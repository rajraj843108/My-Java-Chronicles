package Challenges;
import java.util.Scanner;

public class Q37_ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isArmstrong(num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }

    // Function to check Armstrong number
    public static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int rem = num % 10;
            sum += Math.pow(rem, digits);
            num /= 10;
        }

        return sum == original;
    }
}
