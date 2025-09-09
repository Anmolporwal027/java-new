class Q84{
    public static void main(String args[]){
        char ch = 97;
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                if(j==0 || i == j || i==4 )
                    System.out.print(ch++);

                else    
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}