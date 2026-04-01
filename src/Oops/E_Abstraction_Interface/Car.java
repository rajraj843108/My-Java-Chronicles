package Oops.E_Abstraction_Interface;

public class Car extends Vehicle {

    private int noOfDoor;

    public int getNoOfDoor() {
        return noOfDoor;
    }

    public void setNoOfDoor(int noOfDoor) {
        this.noOfDoor = noOfDoor;
    }

    public Car(int noOftyre) {
        super(noOftyre);
    }

    @Override
    public void StartSound() {
        System.out.println("brummmmmm.......");
    }

    @Override
    public void getSetGo() {
        System.out.println("Going to any place...");
    }
}
