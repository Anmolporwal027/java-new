/*
    How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
 */

class test{
    public static void main(String args[]){
        float len = 13 , bre = 7;
        float rlen = 520 , rbre = 140;

        float tarea = len * bre;
        float rarea = rlen * rbre;
        
        float numofTile = rarea/tarea;

        System.out.println("Numberr of tiles are : "+numofTile);

    }
}