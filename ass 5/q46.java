// 46) WAP to find out the sum of first and last digit of a user entered number 
import java.util.Scanner;
class Q46{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit number to get sum ");
        int n = sc.nextInt();
        int fd = 0;
        int ld = n%10;
        fd = n/10000;
        System.out.println("Sum of first: "+fd+" and last:"+ld+" is : "+(fd+ld));        
    }
}