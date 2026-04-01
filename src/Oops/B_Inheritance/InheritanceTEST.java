package Oops.B_Inheritance;

public class InheritanceTEST {
    static void main(String[] args) {

        Vechile myvechil=new Vechile();
        myvechil.commute();
        System.out.println();

        TwoWheeler myTwo=new TwoWheeler();
        myTwo.commute();
        myTwo.balance();
        System.out.println();

        MotorCycle bullet=new MotorCycle();
        bullet.commute();
        bullet.balance();
        bullet.start();


    }
}
