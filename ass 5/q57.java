// 57) WAP to print all the prime numbers between two entered numbers
import java.util.Scanner;
class Q57{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number till you want to check prime no ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            int flag = 0;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0 && i>1){
                System.out.println("Prime "+i);
            }
            
        }
    }
}