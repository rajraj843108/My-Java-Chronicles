package Challenges;

import java.util.Scanner;

public class Q63_MaxArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=ArrayInput.Utility();
//        int ans=maxarr(array);
//        System.out.print("Max is: "+ ans);

        int max=Integer.MIN_VALUE;
//        for(int num:array) {
//            if (max < num) {
//                max = num;
//            }
//        }
        System.out.println("Max no. is: " + max);
    }

    public static int maxarr(int[] array){
        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
}
