class Q108{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                if(i == k || k == 1 || i==5){
                    System.out.print("1");
                }
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}