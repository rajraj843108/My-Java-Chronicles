package Lecture;

public class l14_array2D {
    static void main(String[] args) {

        int myArr[][]=new int[2][3];
        myArr[0][0]=12;

        int arr[][]={{2,3,6},{5,4,9},{9,8,5}};
        System.out.println("No. of column in row: "+arr[0].length);
      //  System.out.println("No. of column in row: "+arr[1].length);
        System.out.println("No. of rows: "+arr.length + "\n");

//        int i=0;
//        while (i< arr.length){
//            int j=0;
//            while (j<arr[i].length){
//                System.out.print(arr[i][j] + "  ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
