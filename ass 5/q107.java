class Q107{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            char ch = 65;
            for(int k=1; k<=i; k++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}