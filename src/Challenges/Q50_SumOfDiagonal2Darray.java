package Challenges;

import java.util.Scanner;

public class Q50_SumOfDiagonal2Darray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to sum of both diagonal of 2D Array if \"rows=columns\" : ");
        int[][] numArray=ArrayInput.Utility2Darray();
        long sum=sumOfDiagonal(numArray);
        System.out.println("Sum of Diadonal is: " + sum);
    }

    public static long sumOfDiagonal(int[][] numArray){
        long leftSum=sumOfLeftDiagonal(numArray);
        long rightSum=sumOfRightDiagonal(numArray);
        int n= numArray.length;
        long sum=leftSum + rightSum;
        if (n % 2 ==1){
            sum=sum - numArray[n/2][n/2];
        }
        return sum;
    }

//Primary Diagonal
    public static long sumOfLeftDiagonal(int[][] numArray){
        int sum=0;
        for (int i=0;i<numArray.length;i++){
            sum=sum + numArray[i][i];
        }
        return sum;
    }

//Secondary Diagonal
    public static long sumOfRightDiagonal(int[][] numArray){
        int sum=0;
        for (int i=0;i< numArray.length;i++){
            int n= numArray.length;
            sum=sum + numArray[i][n-1-i];
        }
        return sum;
    }
}



//package Challenges;
//
//import java.util.Scanner;
//
//public class Q50_SumOfDiagonal2Darray {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Welcome to sum of both diagonals of 2D Array:");
//
//        // Take 2D array input
//        int[][] arr = ArrayInput.Utility2Darray();
//
//        int n = arr.length;
//        long sum = 0;
//
//        // Loop to calculate both diagonals
//        for (int i = 0; i < n; i++) {
//            sum += arr[i][i];           // primary diagonal
//            sum += arr[i][n - 1 - i];   // secondary diagonal
//        }
//
//        // If matrix size is odd, subtract middle element once
//        if (n % 2 == 1) {
//            sum -= arr[n / 2][n / 2];
//        }
//
//        System.out.println("Sum of Diagonal is: " + sum);
//    }
//}