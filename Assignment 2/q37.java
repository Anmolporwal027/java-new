/*
    The surface of the cylinder is 149 cm². The cylinder height is 6 cm. What is the diameter of this cylinder?
 */
class test{
    public static void main(String args[]){
        double sa = 149;
        double r;
        double height = 6;

        int a = 2;
        int b = 12;
        int c = -149;

        r = (Math.sqrt(b*b-4*a*c/Math.PI)/4)-(3);
        System.out.println("diameter of the cylinder "+(r*r));
    }
}