// 41. WAP to program to take 3 digit number from user and checks whether it is armstrong or not
import java.util.Scanner;
class TestMain{
    public void checkArm(int n){
        int m = n;
        int sum = 0;
        while(m!=0){
            int rem = m%10;
            sum += Math.pow(rem,3);
            m/=10;
        }
        if(sum == n)
            System.out.println("Given number "+n+" is Armstrong ");
        else
            System.out.println("Given number "+n+" is not Armstrong ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 3 digit numbeer");
        int n = sc.nextInt();

        TestMain t = new TestMain();
        t.checkArm(n);
    }
}