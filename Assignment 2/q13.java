/*
    The area of a right triangle is 184 cm² and one of its legs is 16 cm long. Find the length of other leg.
 */

class test {
    public static void main(String args[]){
        float b = 16;
        float area = 184;
        float h;
        h = (area/b)*2;
        System.out.println("height of right triangle is : "+h);
    }
}