//1,4,9,16,25 ...
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want series 1 , 4 , 9 , 16 , 25 ... ");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.print(i*i+" ");
        }
    }
}