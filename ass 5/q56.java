// 56) WAP to print factorial of all the numbers between two entered numbers
import java.util.Scanner;
class Q56{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number till you want factorials ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            int fact = 1;
            for(int j=1; j<=i; j++){
                fact *= j;
            }
            System.out.println("Factorial of "+i+" is "+fact);
        }
    }
}