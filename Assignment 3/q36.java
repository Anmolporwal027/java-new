// 36. WAP to accept 4 digit number and find out the greatest and smallest digit from it.
import java.util.Scanner;
class TestMain{
    public void check(int n){
        int s = 10;
        int l = 0;
        int m = n;
        while(n != 0){
            int rem = n%10;
            if(rem < s)
                s = rem;
            if(rem > l)
                l = rem;
            n /= 10;
        }
        System.out.println("Smallest from "+m+" is "+s);
        System.out.println("largest from "+m+" is "+l);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        int n = sc.nextInt();
        TestMain t = new TestMain();
        t.check(n);
    }
}