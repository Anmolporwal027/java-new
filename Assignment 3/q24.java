// 24. Write a program that accepts three digit number and find out the sum of all the individual digits
import java.util.Scanner;
class TestMain{
    public int sum(int n){
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum += rem ;
            n = n/10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 digit number");
        int n = sc.nextInt();

        TestMain t = new TestMain();
        System.out.println("Sum of 3 digit number is "+t.sum(n));
    }
}