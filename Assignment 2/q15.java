/*
    Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?
 */

class test{
    public static void main(String args[]){
        float slen = 22;
        float sbree = 15;
        float rarea = 21*21;
        float sarea = slen * sbree;

        System.out.println("Area of shelly is = "+ sarea);
        System.out.println("Area of rachel is = "+ rarea);
        System.out.println("difference is = "+(rarea - sarea));


    }
}