// palindrome or not
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        if(m == rev)
            System.out.print(m+" is palindrome");
        else
            System.out.print(m+" is not palindrome");
    }
}