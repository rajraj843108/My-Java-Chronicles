package Challenges;
import java.util.Scanner;

public class Q20_DiffAgeGroup {
    static void main() {
        Scanner sc=new Scanner(System.in);

        System.out.println("Categorize Person in Diff. age groups: \n");
        System.out.print("Enter your age: ");
        float num=sc.nextFloat();

        if (num>=60){
            System.out.println("Your are: Senior");
        } else if (num>=20) {
            System.out.println("Your are: Adult");
        } else if (num>=13) {
            System.out.println("Your are: Teen");
        }  else {
            System.out.println("Your are: Child");
        }


    }
}
