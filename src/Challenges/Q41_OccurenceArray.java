package Challenges;
import java.util.Scanner;

public class Q41_OccurenceArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        int[] arr={12,13,14,12,13,14,15,19,14,17,18,19,20};
        System.out.println("Welcome To Array Occurrence:-");

        int[] arr= ArrayInput.Utility();

        System.out.print("Enter your no. for finding Occurrence: ");
        int num=sc.nextInt();
        int occurrence=onOfOccurrence(arr,num);
        System.out.println("Your element was found " + occurrence + " times in Array");

    }

    public static int onOfOccurrence(int[] arr,int num){
        int occ=0;
        int i=0;
        while (i<arr.length){
            if (arr[i]==num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
