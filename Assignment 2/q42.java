/*
    Find the Volume of Cylinder whose diameter and height are 2.25cm
 */

class test{
    public static void main(String args[]){
        double dia = 2.25;
        double radi = dia/2;
        double height = 2.25;
        double volume = 3.14*(radi*radi)* height;

        System.out.println("Total volume of cylinder "+volume);
    }
}