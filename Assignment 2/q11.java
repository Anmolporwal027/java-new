/*
    The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the triangle.
 */

class test {
    public static void main(String args[]){
        float area = 320;
        float x , B , H;
        //Assume that 5x is the base and the height is 8x
        //area = 1/2* base * height
        x = (float)(Math.sqrt((2*area)/40));
        B = 5*x;
        H = 8*x;
        System.out.println("height = "+H);
        System.out.println("Base = "+B);
    }
}
