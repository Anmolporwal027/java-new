/*
    Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.
 */
class test{
    public static void main(String args[]){
        double dia = 12;
        double radi = dia/2;
        double height = 9;
        double totalSarea = 2*3.14*radi*(height+radi);

        System.out.println("Total surface area of cylinder "+totalSarea);
    }
}