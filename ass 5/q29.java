// 1	11	111	1111  11111	...
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want series  1 11	111	1111  11111	...");
        int n = sc.nextInt();
        for(int i=1; n != 0; n--){  
            System.out.print(i+" ");
            i = (i*10)+1;
        }
    }
}