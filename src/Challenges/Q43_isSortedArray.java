package Challenges;
import java.util.Scanner;

public class Q43_isSortedArray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome To Check Array is Sorted or not: ");
        int[] numArr=ArrayInput.Utility();
        boolean incArr=inIncreasing(numArr);
        boolean decArr=inDecreasing(numArr);

        if (incArr || decArr){
            System.out.println("Array is Sorted:");
        } else {
            System.out.println("Array is NOT Sorted:");
        }
    }

    public static boolean inIncreasing(int[] numArr){
        int i=1;
        while (i<numArr.length){
            if (numArr[i]<numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean inDecreasing(int[] numArr){
        int i=1;
        while (i<numArr.length){
            if (numArr[i] > numArr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}


//import java.util.Scanner;
//
//public class Q43_isSortedArray {
//    static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Welcome To Check Array is Sorted or not:");
//
//        System.out.print("Enter array size: ");
//        int n = sc.nextInt();
//
//        int[] numArr = new int[n];
//
//        System.out.println("Enter array elements:");
//        for (int i = 0; i < n; i++) {
//            numArr[i] = sc.nextInt();
//        }
//
//        boolean increasing = true;
//        boolean decreasing = true;

//          // Sorted check

//        for (int i = 1; i < n; i++) {
//            if (numArr[i] < numArr[i - 1]) {
//                increasing = false;
//            }
//            if (numArr[i] > numArr[i - 1]) {
//                decreasing = false;
//            }
//
//        }
//
//        if (increasing || decreasing) {
//            System.out.println("Array is Sorted");
//        } else {
//            System.out.println("Array is NOT Sorted");
//        }
//
//    }
//}
