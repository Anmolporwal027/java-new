/*
    Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side.
 */
class test{
    public static void main(String args[]){
        float hp = 13;
        float pp = 12;
        float base = (float) Math.sqrt((hp*hp)-(pp*pp));
        System.out.println("Length of the other side is "+base);
        double area = (float) (1/2f)*base*pp;
        System.out.println("area =  "+area);
    }
}