/* 
   The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter
*/

class test{
    public static void main(String args[]){
        float area = 96;
        float len , bre = 8;

        len = area / bre;
        System.out.println("lenght is : "+len);
         
        float peri = 2*(len + bre);
        System.out.println("Perimeter is : "+peri);
    }
}