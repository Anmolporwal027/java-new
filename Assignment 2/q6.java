/*
    .Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.
 */

class test {
    public static void main(String args[]){
        float peri = 36 , s1 = 9 , s2 = 10;
        float s3 = peri - (s1+s2);
        float s = (s1+s2+s3)/2;
        double area = Math.sqrt(s * (s-s1) * (s-s2) * (s-s3));
        System.out.println("Area of the triangle is "+area);
    }
}