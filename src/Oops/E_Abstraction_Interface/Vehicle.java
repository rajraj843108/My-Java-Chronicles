package Oops.E_Abstraction_Interface;

public abstract class Vehicle implements Transport {

    private int noOftyre;

    public Vehicle(int noOftyre) {
        this.noOftyre = noOftyre;
    }

    public abstract void StartSound();

    public int getNoOftyre() {
        return noOftyre;
    }

    public void setNoOftyre(int noOftyre) {
        this.noOftyre = noOftyre;
    }

    public void commute(){
        System.out.println("Going.....");
    }
}
