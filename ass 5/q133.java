class Q133{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            char ch = 65;
            for(int k=5; k>=i; k--){
                System.out.print((ch++)+" ");
            }
            System.out.println();
        }
    }
}