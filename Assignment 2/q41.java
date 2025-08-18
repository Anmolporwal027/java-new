/*
    . I need to calculate the cylinder volume with a height of 50 cm and a diameter of 30 cm.
 */

class test{
    public static void main(String args[]){
        double dia = 30;
        double radi = dia/2;
        double height = 50;
        double volume = 3.14*(radi*radi)* height;

        System.out.println("Total volume of cylinder "+volume);
    }
}