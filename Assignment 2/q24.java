/*
    24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?
 */

class test{
    public static void main(String args[]){
        double wl = 20*100;
        double wh = 2*100;
        double ww = 0.75*100;

        double bl = 25;
        double bw = 10;
        double bh = 7.5;

        double brickvol = bl * bw * bh;
        double wallvol = wl * ww * wh;

        double numofbrick = wallvol/brickvol;
        System.out.println("Number of bricks are : "+numofbrick);
        double totalcostperthousand = numofbrick*900;
        System.out.println(" cost "+totalcostperthousand);

    }
}