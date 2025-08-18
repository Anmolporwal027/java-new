/*
    32. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden
 */

class test {
     public static void main(String args[]){
         double area  =  150*150;
         double pool = 25*25;
        double newarea = area - pool;
         System.out.println("area of the garden after removing pool "+newarea);
     }
}