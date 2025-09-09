class Q109{
    public static void main(String args[]){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            char ch = 65;
            for(int k=1; k<=i; k++){
                if(i == k || k == 1 || i == 5)
                    System.out.print(ch);
                else    
                    System.out.print("_");

                ch++;
            }
            System.out.println();
        }
    }
}