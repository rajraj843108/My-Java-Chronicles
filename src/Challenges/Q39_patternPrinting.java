package Challenges;
import java.util.Scanner;

public class Q39_patternPrinting {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome To pattern Printing:-");
        System.out.print("Please enter your number:");
        int num=sc.nextInt();

        patternOne(num);
        System.out.println();

        patternTwo(num);
        System.out.println();

        patternThree(num);
        System.out.println();
        
        patternFour(num);


    }

    public static void patternOne(int num){
// RIGHT HALF PYRAMID
        int i=1;
        while (i<=num){
         //   System.out.print("* ");

            int j=1;
            while (j<=i){
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i++;

        }
    }


    public static void patternTwo(int num){
// REVERSE RIGHT HALF PYRAMID
        for (int i=1;i<=num;i++){
            for (int j=1;j<=(num-i+1);j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }


    public static void patternThree(int num){

        for (int i=1;i<=num;i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternFour(int num){

        for (int i=1;i<=num;i++) {
            for (int j = 1; j <= (num - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }









}
