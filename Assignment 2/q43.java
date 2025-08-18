/*
    Find the cost of polishing the base of a cone whose height is 4cm and slant height 5 cm at the rate of 10 rs. Per sq. cm
 */
class test{
    public static void main(String args[]){
        double slanth = 5;
        double rate = 10;
        double height = 4;
        double r = Math.sqrt((slanth*slanth) - (height*height));
        double base = Math.PI * r * r;
        double cost = base * rate;
        System.out.println("Total rate of polishing "+cost);
    }
}