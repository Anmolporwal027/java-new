/*
Find the area of an equilateral triangle, the length of whose sides is 12 cm.
*/

class test{
    public static void main(String args[]){
        float side = 12;
        double area = (Math.sqrt(3)/4)*(side*side);
        System.out.println("area of the equilateral triangle is : "+area);
    }
}