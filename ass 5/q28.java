// 28) 1	2	3	4	 Hello	6	7	8	9	Hello	11	12 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want series  1	2	3	4	 Hello	6	7	8	9	Hello	11	12 ");
        int n = sc.nextInt();
        for(int i=1; n != 0; n--){
            if(i % 5 != 0)
                System.out.print(i+" ");
            else    
                System.out.print("Hello ");
            
            i++;
        }
    }
}