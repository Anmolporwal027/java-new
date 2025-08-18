/*
    23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
*/

class test{
    public static void main(String args[]){
        float cl = 15;
        float cb = 9;
        float ch = 12;
        float cartonvol = cl * cb * ch; 
        float boxvol = 3 * 3 * 3;
        float numcubicalbox = cartonvol/boxvol;
        System.out.println(" number of cubical boxes "+numcubicalbox);
    }
}