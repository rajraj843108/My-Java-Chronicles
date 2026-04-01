package Oops.E_Abstraction_Interface;

public class TESTabstraction {
    static void main(String[] args) {

       // Vehicle vic=new Vehicle(4);
        Car mycar=new Car(5);
//        vic.commute();
//        System.out.println( vic.getNoOftyre());

        mycar.commute();
        System.out.println(mycar.getNoOftyre());
        mycar.setNoOfDoor(6);
        System.out.println(mycar.getNoOfDoor());
        mycar.StartSound();
        mycar.getSetGo();

    }
}
