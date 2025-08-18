/*
    What is the surface area of a cylinder if the diameter is 15m height is 7m?
 */

class test{
    public static void main(String args[]){
        double diameter = 15;
        double radi = diameter/2f;
        double height = 7;
        double totalSarea = 2*3.14*radi*(height+radi);

        System.out.println("Total surface area "+totalSarea);
    }
}