package Challenges;
import java.util.Scanner;

public class Q36_fibonacci {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome Fibonacci Series:");
        System.out.print("Enter no. up to fibonacci series print:");
        int num = sc.nextInt();
        System.out.println("Fibonacci serise of " + num + " are:-");
        fibonacci(num);

    }

    public static void fibonacci(int num){

        int first=0,second=1;

//        if (num < 0) return;
//        if (num >= 0)
//            System.out.print(first + " ");
//        if (num >= 1)
//            System.out.print(second + " ");

        if (num<0) return;
        System.out.print("0 ");
        if (num==0) return;
        System.out.print("1 ");


        while (first+second<=num){
            int third=first+second;
            System.out.print(third +" ");
            first=second;
            second=third;
        }
    }
}
