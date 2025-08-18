/*
    Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
 */

class test{
    public static void main(String args[]){
        double hei = 12;
        double radi = 7.7;
        double totalSarea = 2*3.14*radi*(hei+radi);

        System.out.println("Total surface area "+totalSarea);
    }
}