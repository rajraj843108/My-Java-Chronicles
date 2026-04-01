package Challenges;
import java.util.Scanner;

public class ArrayInput {

    public static int[] Utility(){
        Scanner sc=new Scanner(System.in);
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
        System.out.println();
        return arr;
    }

    public static int[][] Utility2Darray(){
        Scanner sc=new Scanner(System.in);
    //    System.out.println("Welcome to 2D array: ");
        System.out.print("Enter the no. of rows: ");
        int rows =sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int columns =sc.nextInt();

        int[][] Arr=new int[rows][columns];

        for (int i = 0; i< rows; i++){
            for (int j = 0; j< columns; j++){
                System.out.print("Enter your element row:"+(i+1)+" " +"column"+(j+1)+": ");
                Arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Array: ");

        for (int i = 0; i< rows; i++){
            for (int j=0;j<columns;j++){
                System.out.print(Arr[i][j] +" ");

            }
            System.out.println();
        }
        return Arr;
    }

}


