// 30) 1+11+111+1111+11111+...
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want sum 1+11+111+1111+11111+...");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; n != 0; n--){
             i = (i*10)+1;
             sum += i;
        }
        System.out.print("Sum = "+sum);
    }
}