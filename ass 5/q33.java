// 33) WAP to print Alphabets in reversing order.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character from you want alphabet in reverse ");
        char n = sc.next().charAt(0);
        for(char c = 'z' ; c >= n; c--){
            System.out.print(c+" ");
        }
    }
}