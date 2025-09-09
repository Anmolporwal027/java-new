// 49) WAP to find out all the perfect numbers between two entered numbers]
import java.util.Scanner;
class Q49{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers between you want to check num is perfect or not ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            int sum = 0;
            for(int j=1; j<i; j++){
                if(i%j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println("Perfect no is : "+i);
            }
        }

    }
}