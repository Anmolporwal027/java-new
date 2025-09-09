//reverse the number
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for reverse ");
        int n = sc.nextInt();
        while(n != 0){
            int rem = n % 10;
            System.out.print(rem);
            n = n/10;
        }
    }
}