/*
    Luci is making a display board for the school exhibition. The display board is a 3 m by 2 m rectangle. He needs to add a ribbon border around the entire display board. What is the length of ribbon that he needs?
 */

class test{
    public static void main(String args[]){
        float len = 3, bre = 2;
        double ribbon = 2*(len + bre);
        System.out.println("ribbon needs = "+ribbon);
    }
}