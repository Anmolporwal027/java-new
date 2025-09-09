// 43) WAP to convert binary number into decimal number
import java.util.Scanner;
class Q43{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number to convert into decimal ");
        int n = sc.nextInt();
        int pow = 0;
        int num = 0;
        while(n > 0){
            int rem = n%10;
            num += rem * Math.pow(2,pow);
            n = n/10;
            pow++;
        }
        System.out.println("Decimal : "+num);
    }
}