// 53) WAP to print all the strong numbers between two entered numbers
import java.util.Scanner;
class Q53{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number between you want to check strong or not ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            int n = i;
            int sum = 0;
            while(n != 0){
                int rem = n%10;
                int fact = 1;
                for(int j=1; j<=rem; j++){
                    fact = fact * j;
                }
                sum += fact;
                n = n/10;
            }
            if(sum == i){
                System.out.println("Strong number "+i);
            }
        
        }
    }
}