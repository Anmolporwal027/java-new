/*
    33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. One pathway has a width of 3m and the other, 4 m. Calculate the total usable area of the garden.
*/
class test {
     public static void main(String args[]){
        double gL = 30;
        double gW = 20;
        double garea = gL*gW;
        double path1area = 30 * 3; //horixontal
        double path2area = 20 * 4; //vertical
        double crosspath = 3 * 4;
        double totalpathcovered = (path1area + path2area)-crosspath;
        double usablearea = garea - totalpathcovered;
         System.out.println("usable area "+usablearea);
     }
}