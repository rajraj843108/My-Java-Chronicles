package Challenges;
import java.util.Scanner;

public class Q19_GradeBasedOnMarks {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome To Grades Calculator\n");
        System.out.print("Enter youe marks(%) To Find Grades: ");
        float num=sc.nextFloat();

        if (num>90){
            System.out.println("Your Grade is: A");
        } else if (num>75) {
            System.out.println("Your Grade is: B");
        } else if (num>60) {
            System.out.println("Your Grade is: C");
        }  else if (num>30) {
            System.out.println("Your Grade is: D");
        }  else {
            System.out.println("Your Grade is: F");
        }


    }
}
