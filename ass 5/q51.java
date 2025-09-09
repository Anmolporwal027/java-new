// 51) WAP to reverse all the numbers between two entered numbers
import java.util.Scanner;
class Q51{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers between you want revsesed ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            int n = i;
            int rev = 0;
            while(n!=0){
                int rem = n%10;
                rev = rev*10 + rem;
                n = n/10;
            }
               System.out.print(rev+" ");
        }
    }
}