class Q139{
    public static void main(String args[]){
        for(int i=7; i>=1; i--){
            int space = (i >= 4)?i-4:4-i;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            int n = (i >= 4)?8-i:i;
            for(int k=1;k<=n; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}