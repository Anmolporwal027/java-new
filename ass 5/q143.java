class Q143{
    public static void main(String args[]){
        for(int i=7; i>=1; i--){

            int space = (i >= 4)?i-4:4-i;
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }

            int n = (i >= 4)?8-i:i;
            for(int k=1;k<=n*2-1; k++){
               if(k==1 || k == n*2-1)
                System.out.print("*");
                else
                System.out.print("_");
            }
            System.out.println();
        }
    }
}