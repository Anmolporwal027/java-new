import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 5 digit number to reverse");
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0){
            int rem = n%10;
            rev = rev*10+rem;
            n /= 10;
        }
        System.out.println("Reverse of number is"+rev);
    }
}