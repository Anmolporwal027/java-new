/*
    A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?
 */

class test{
    public static void main(String args[]){
        float cedge = 7;
        float clen = 7, cbre = 4 , chei = 8;
        float cvol = clen*cbre*chei;
        float cubevol = cedge*cedge*cedge;


        System.out.println("cube volume = "+cubevol);
        System.out.println("cuboid volume = "+cvol);
        
    }
}