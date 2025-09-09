// WAP to check whether entered number is Armstrong or not
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int cnt = 0;
        int m = n;
        int sum = 0;
        while(m != 0){
            int rem = m%10;
            cnt++;
            m = m/10;
        }
        m = n;
        while( m != 0){
            int digit = m % 10;
            int power = 1;
            for(int i=1; i<=cnt; i++){
                power = power * digit;
            }
            sum += power;
            m = m/10;
        }
        if(sum == n)
            System.out.println(n+" is a armstrong number");
        else
            System.out.println(n+" is not a armstrong number");

    }
}