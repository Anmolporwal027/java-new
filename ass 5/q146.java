class Q146{
    public static void main(String args[]){
        for(int i=5; i>=1; i--){
            for(int j=1; j<=6-i; j++){
                System.out.print("*");
            }
            for(int k=1; k<i*2-1; k++){
                System.out.print(" ");
            }
            for(int l=1; l<=6-i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}