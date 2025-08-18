/*
    How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?
 */

class test{
    public static void main(String args[]){
        float Pl, Pb, pA, bA, Bl, Bb;
        Pl= 120*100;
        Pb= 2.4f*100;
        pA = Pl*Pb;
        Bl = 24;
        Bb = 15;
        bA = Bl * Bb;

        float totalbrick = pA/bA;
        System.out.println(" total bricks require is "+totalbrick);
    }
}