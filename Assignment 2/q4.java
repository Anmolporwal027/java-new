/*
    Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 
 */

class test{
    public static void main(String args[]){
        float len = 300 , bre = 150;
        float rate = 6;
        float area = len * bre;
        float cost = area * rate;

        System.out.println("Cost of tiling in "+area+" is "+cost/100);
    }
}