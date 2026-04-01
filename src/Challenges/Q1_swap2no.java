import java.util.Scanner;

public class Q1_swap2no {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number");
        int num1=sc.nextInt();
        System.out.print("Enter second Number");
        int num2=sc.nextInt();

        int temp=num1;
         num1=num2;
         num2=temp;

        System.out.println("Swapping done....");
        System.out.println("Value of First number is:"+num1);
        System.out.println("Value of Second number is:"+num2);
    }
}
