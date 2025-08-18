/*
34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway.
 */

class test {
     public static void main(String args[]){
        double tB1 = 128;
        double tB2 = 92;
        double tH = 40;
        double walkwaywidth = 4; 
        double woodenarea = 1/2f*(tB1+tB2)*tH; 
        double walkwayarea = 4 * 40;
        
         System.out.println("after addition of walkaway area is "+(walkwayarea+woodenarea));
     }
}