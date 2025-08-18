/*
    How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?
 */

class test{
    public static void main(String args[]){
        double ts = 10;
        double tarea = ts*ts;
        double farea = 800 * 900;
        double totaltile = farea / tarea;
        System.out.println("Total square tile "+totaltile);
    }
}