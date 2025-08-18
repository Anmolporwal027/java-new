// 40. WAP to program to take 6 digit number from user and checks whether it is palindrome or not
import java.util.Scanner;
class TestMain{
    public void checkPali(int n){
        int m = n;
        int rev = 0;
        while(m!=0){
            rev = rev*10+m%10;
            m /= 10;
        }
        if(rev == n)
            System.out.println("Given number "+n+" is palindrome ");
        else
            System.out.println("Given number "+n+" is not palindrome ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 6 digit numbeer");
        int n = sc.nextInt();

        TestMain t = new TestMain();
        t.checkPali(n);
    }
}