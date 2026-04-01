package Challenges;
import java.util.Scanner;

public class Q44_DeleteFromarray {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to delete a element from array and rewrite array:");
        int numArray[]=ArrayInput.Utility();
        System.out.print("Enter number which have to delete: ");
        int num=sc.nextInt();

        int[] newArr=deleteElement(numArray,num);
        System.out.print("New Array is: ");
        for (int j=0;j< newArr.length;j++){
            System.out.print(newArr[j] + " ");
        }

    }

    public static int[] deleteElement(int[] numArray,int num){
        int occs=Q41_OccurenceArray.onOfOccurrence(numArray,num);
        if (occs==0){
            return numArray;
        }

        int newSize=numArray.length-occs;
        int newArray[]=new int[newSize];

//        int i=0,j=0;
//        while (i<numArray.length){
//            if (numArray[i] != num){
//                newArray[j]=numArray[i];
//                j++;
//            }
//            i++;
//        }

        int j = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] != num) {
                newArray[j] = numArray[i];
                j++;
            }
        }
        return newArray;

    }
}
