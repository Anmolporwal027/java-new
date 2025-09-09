class Q114{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=6-i; k++){
                if(k==1 || i==1 || k == 6-i)
                    System.out.print(6-i);
                else    
                    System.out.print("_");
            }
            System.out.println();
        }
    }
}