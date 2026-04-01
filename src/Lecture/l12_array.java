package Lecture;

public class l12_array {
    static void main(String[] args) {

 //       int[] myArr=new int[5];
//        myArr[0]=90;
//        myArr[1]=41;
//        myArr[4]=94;
//        myArr[2]=82;
//        myArr[3]=33;

        int [] myArr={90,41,82,33,94};

        System.out.println("Length of array is: " + myArr.length);

//        int index=2;
//        int ans=4;

//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[ans]);

//        int index=0;
//        while (index<5){
//            System.out.println(myArr[index]);
//            index++;
//        }

        int index=0;
        while (index < myArr.length){
//            System.out.println(myArr[index]);
            System.out.println("At index "+index+" Value is "+ myArr[index]);

            index++;
        }


//        for (int i=0;i<5;i++){
//            System.out.println(myArr[i]);
//        }


    }
}
