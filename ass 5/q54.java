// 54) WAP to print all the even numbers between two entered numbers
import java.util.Scanner;
class Q54{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number between you want even numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            if(i%2==0)
                System.out.println("Even : "+i);
        }
    }
}