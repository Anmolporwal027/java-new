/*
    25. 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path
*/

class test{
    public static void main(String args[]){
        double bl = 24;
        double bw = 15;
        double area = bl * bw;
        double totalarea = area * 100;
        System.out.println("Total area for 100 bricks "+totalarea+" cm^2");
    }
}