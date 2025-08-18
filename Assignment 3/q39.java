/*
    39. Find the result of following (accept values for variables used in right side of expression)
        a. y=x-2 +3*x-7 (print value of y)
        b. y=x++ + ++x (print value of x and y)
        c. z= x++ - --y - --x + x++ (print value of x ,y and z)
        d. z = x && y || !(x||y) (print value of Z)
 */

class TestMain{
    public static void main(String args[]){
       int x = 1;
       int y = x-2+3*x-7;
       System.out.println("Value of y after (x-2+3*x-7) operation "+y);
       y=x++ + ++x;
       System.out.println("Value of x and y after (y=x++ + ++x) operation x = "+x+" y = "+y);
       int z = x++ - --y - --x + x++;
       System.out.println("Value of x and y and x after (z= x++ - --y - --x + x++) operation x = "+x+" y = "+y+" z = "+z);
    //    z = x && y || !(x||y);
    //    System.out.println("Value z after (x && y || !(x||y)) operation z= "+z);
    }
}