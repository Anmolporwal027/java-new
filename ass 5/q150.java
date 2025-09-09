class Q150{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            int num = 1; 
            for(int k=1; k<=i*2-1; k++){
                System.out.print(num);
                num = 1-num;
            }
            System.out.println();
        }
    }
}