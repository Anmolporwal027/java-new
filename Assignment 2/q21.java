/*
    A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?
 */

class test{
    public static void main(String args[]){
        int bl = 15;
        int bb = 8;
        int bh = 5;

        int wl = 15*100;
        int wb = 10*100;
        int wh = 8*100;

        int brickvol = bl * bb * bh; 
        long wallvol = (long)wl * wb * wh;

        long numbrick = wallvol/brickvol;

        System.out.println("number of brock = "+numbrick);
        
        
    }
}