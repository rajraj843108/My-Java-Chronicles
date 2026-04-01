package Challenges;

 class DiceRoll {

     int Dice(){
        double random=Math.random()*6;
    //    double occ=Math.ceil(random);
        return (int)Math.ceil(random);
    }

    static void main(String[] args) {
        DiceRoll mydice=new DiceRoll();

        for (int i=0;i<41;i++){
            System.out.println(mydice.Dice());
        }

    }

}
