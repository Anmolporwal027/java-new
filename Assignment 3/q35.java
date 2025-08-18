// WAP to find out the sum of individual digits of a 4 digit number and if sum is more than 9 then again find out the sum of digits.   
import java.util.Scanner;
class TestMain{
    public int checkSum(int n){
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        int n = sc.nextInt();
        TestMain t = new TestMain();
        int sum = t.checkSum(n);
        if(sum > 9){
            System.out.println("Sum of 4 digit "+n+" which is greater than 9 is : "+sum);
            System.out.println("Now the sum of Added digits "+sum+" is "+t.checkSum(sum));
        }
        else   
            System.out.println("Sum of 4 digit is "+sum);
    }
}