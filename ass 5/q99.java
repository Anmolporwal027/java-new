class Q99{
    public static void main(String args[]){
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                if(j==1 || i==j || i==5)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}