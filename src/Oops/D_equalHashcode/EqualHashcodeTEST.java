package Oops.D_equalHashcode;

public class EqualHashcodeTEST {

    static void main(String[] args) {

        Person person1=new Person("Raj",22,"0133QWE");
        Person person2=new Person("Raj",22,"0133QWE");

       // Here it show not equal because it compare memory location not comparing value; due to new
        //keyword it has different location on heap memory.
        if (person1==person2){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }


        //It also show not equal because yaha pe bydefault equal parent class generete karta hai jo memoey refrance ko compare karta hai .
        //Isko ham Khud se change kar sakte hai
        if (person1.equals(person2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        //NOW it return equal because we create equal function in parent class
        if (person1.equals(person2)){
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }



    }

}
