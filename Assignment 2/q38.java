/*
    The cylinder has a volume of 1287. The base has a radius 10. What is the area of the surface of the cylinder?
 */
class test{
    public static void main(String args[]){
        double vol = 1287;
        double radi = 10;
        double height = vol/(3.14*radi*radi);
        double totalSarea = 2*3.14*radi*(height+radi);

        System.out.println("Total surface area of cylinder "+totalSarea);
    }
}