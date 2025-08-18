/*
 1.	 The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
  */

 class test{
    public static void main(String args[]){
        float peri = 230;
        float len = 70;
        float breadth; 
        breadth = (peri/2)-len;

        System.out.println("Breadth of the rectangle is "+breadth);

        float area = len * breadth;
        System.out.println("Area of rectangle is "+area);
    }
 }