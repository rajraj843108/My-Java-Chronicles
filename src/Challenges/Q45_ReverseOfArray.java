package Challenges;
import java.util.Scanner;

public class Q45_ReverseOfArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to reverse of an array: ");
        int[] numArray=ArrayInput.Utility();
        reverse(numArray);
        System.out.print("Reverse Array is: ");
        for (int j=0;j< numArray.length;j++){
            System.out.print(numArray[j] + " ");
        }
    }

    public static void reverse(int[] numArray) {
        int n = numArray.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp=numArray[start];
            numArray[start]=numArray[end];
            numArray[end]=temp;

            start++;
            end--;
        }
    }
}
