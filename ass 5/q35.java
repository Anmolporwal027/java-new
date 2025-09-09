// WAP to count number of digits
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int cnt = 0;
        while(n != 0){
            int rem = n % 10;
            cnt++;
            n = n/10;
        }
        System.out.print(cnt+" is the count of number : "+n);
    }
}