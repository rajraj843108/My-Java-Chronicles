package Challenges;
import java.util.Scanner;

public class Q42_MaxMinArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Max AND Min array");
        int[] numArr=ArrayInput.Utility();

        int aMax=maxArray(numArr);
        System.out.println("Max Array is: " + aMax);

        int aMin=minArray(numArr);
        System.out.println("Min Array is: " + aMin);
    }

    public static int maxArray(int[] numArr){
        if (numArr.length==0){
            return Integer.MIN_VALUE;
        }

        int max=numArr[0];
        int i=1;
        while (i< numArr.length){
            if (max<numArr[i]){
                max=numArr[i];
            }
            i++;
        }
        return max;
    }

    public static int minArray(int[] numArr){

        int min=numArr[0];
        int i=1;
        while (i< numArr.length){
            if (min>numArr[i]){
                min=numArr[i];
            }
            i++;
        }

        //ANOTHER APPROACH

//        int min=Integer.MAX_VALUE;
//        int i=0;
//        while (i< numArr.length){
//            if (min>numArr[i]){
//                min=numArr[i];
//            }
//            i++;
//        }
        return min;
    }

}
