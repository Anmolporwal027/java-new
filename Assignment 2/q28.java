/*
    A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter.
 */

class test{
    public static void main(String args[]){
        double cl = 5;
        double cw = 4;
        double carea = cl * cw;
        double totalcost = carea * 205;
        System.out.println("Total cost for carpet "+totalcost+" m^2");
    }
}