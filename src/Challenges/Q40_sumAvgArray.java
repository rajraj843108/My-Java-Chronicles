package Challenges;
import java.util.Scanner;

public class Q40_sumAvgArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to sum and avg. of an array:");
        System.out.print("Enter the length of Array: ");
        int num=sc.nextInt();

        int[] arr=new int[num];
        for (int i=0;i<num;i++){
            System.out.print("Enter your element No:"+(i+1)+" ");
            arr[i]=sc.nextInt();
        }

        System.out.print("Array: ");

        for (int i=0;i<num;i++){
            System.out.print(arr[i] +" ");
        }

        double sum=0;
        for (int i=0;i<num;i++){
            sum=sum+arr[i];
        }
        System.out.println();
        System.out.print("SUM: " + sum +"\n");


        double avg= sum/ arr.length;
        System.out.println("Avg. is: " + avg);



    }
}
