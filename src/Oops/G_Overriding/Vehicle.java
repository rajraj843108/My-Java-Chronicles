package Oops.G_Overriding;

public abstract class Vehicle {
    private int noOftyre;

    protected void Vehicle(){
        this.noOftyre=0;
    }

    protected void Vehicle(int noOftyre) {
        this.noOftyre = noOftyre;
    }

    public int getNoOftyre() {
        return noOftyre;
    }


    public void start(){
        System.out.println("Vehicle is starting...");
    }
}
