/*
    Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m
 */

class test{
    public static void main(String args[]){
        double dl = 20;
        double dw = 15;
        double darea = dl * dw;
        double totalcost = darea * 5;
        System.out.println("Total cost for tiling "+totalcost+" m^2");
    }
}