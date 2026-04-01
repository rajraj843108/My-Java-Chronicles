package Challenges;
import java.util.Scanner;

public class Q46_PalindromeArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to palindrome array checker:");

        int numArray[]=ArrayInput.Utility();
        boolean palindrome=isPalindrome(numArray);

        if (palindrome){
            System.out.println("Your array is palindrome:");
        } else {
            System.out.println("Your array is NOT palindrome:");
        }


    }

    static boolean isPalindrome(int[] arr) {
        int i = 0, j = arr.length - 1; //i=start;j=end
        while (i < j) {
            if (arr[i] != arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
