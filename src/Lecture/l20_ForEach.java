package Lecture;

public class l20_ForEach {
    static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
    //    String[] arr={"Rishi","Saloni","Mannu","Kulfi","raj"};
        String[] arr=new String[] {"Rishi","Saloni","Mannu","Kulfi","raj"};

//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

//FOLLOWING ARE FOE EACH LOOP:----
        for (String name:arr){
            System.out.println(name);
        }
        System.out.println();
        for (int name:array){
            System.out.print(name + " ");
        }

    }
}
