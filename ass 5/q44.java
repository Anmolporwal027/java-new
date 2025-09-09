// 44) WAP to interchange first and last digit of a number
import java.util.Scanner;
class Q44{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only 5 digit number to interchange ");
        int n = sc.nextInt();
        int fd = 0;
        int ld = n%10;
        n = n/10;
        fd = n/1000;
        int md = n%1000;
        int interchanged = (ld * 10000)+(md*10)+fd;
        System.out.println("Inter changed digit = "+interchanged);        
    }
}