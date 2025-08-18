/*
    30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?
 */

class test{
    public static void main(String args[]){
        double tl = 5;
        double tb = 8;
        double tarea = tl*tb;
        double flen = 200;
        double fwid = 400;
        double farea = flen * fwid;
        double totaltile = farea / tarea;
        System.out.println("Total  tile "+totaltile);
    }
}