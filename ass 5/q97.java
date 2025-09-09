class Q97{
    public static void main(String args[]){
        for(int i=5; i>=1; i--){
            char ch = 65;
            for(int j=1; j<=i; j++){
                if(j==1 || i == 5 || i == j)
                    System.out.print(ch++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}