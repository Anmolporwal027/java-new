/*
    8. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².
 */
class test{
    public static void main(String args[]){
        float area = 0.8f;
        float height = 20;
        height = height/100;
        double base = (area/height)*2;
        System.out.println("Base of the triangle is "+base);
    }
}