package Oops.F_SuperKeyword;

public abstract class Vehicle {
    private int noOftyre;

    protected Vehicle(){
        this.noOftyre=0;
    }

    protected Vehicle(int noOftyre) {
        this.noOftyre = noOftyre;
    }

    public int getNoOftyre() {
        return noOftyre;
    }

    public abstract void start();
}











































