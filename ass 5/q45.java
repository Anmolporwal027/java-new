// 45) WAP to find out the sum of all the digits of a number
import java.util.Scanner;
class Q45{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get sum  ");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            int rem = n%10;
            sum += rem;
            n = n/10;
        }
        System.out.println("sum =  "+sum);
    }
}