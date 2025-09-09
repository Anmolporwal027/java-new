class Q100{
    public static void main(String args[]){
        for(int i=6; i>=1; i--){
            int k = i;
            for(int j=1; j<=i; j++){
                if(i%2 == 0)
                    System.out.print(j);
                else{
                    System.out.print(k--);
                }
           }
           System.out.println();
        }
    }
}