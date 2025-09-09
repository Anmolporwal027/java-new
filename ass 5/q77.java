class Q77{
    public static void main(String args[]){
        char ch = 97;
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}