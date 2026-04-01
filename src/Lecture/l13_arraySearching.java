package Lecture;

import java.util.Scanner;

public class l13_arraySearching {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,13,14,15,17,18,19,20};
        System.out.println("Welcome To Array Searching:-");
        System.out.print("Enter your no. for search: ");
        int num=sc.nextInt();

        boolean isArray=isArray(arr,num);
        if (isArray){
            System.out.println("Your no. found in Arrau ");
        } else {
            System.out.println("Your no. NOT found in Arrau ");
        }


    }

    public static boolean isArray(int[] arr, int num){
        int index=0;
        while (index < arr.length){
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }

}
