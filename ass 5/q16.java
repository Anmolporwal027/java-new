// -6 -3 0 3 6 9 12..
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want series -6 -3 0 3 6 9");
        int n = sc.nextInt();
        int i = -6;
        while(n != 0){
            System.out.print(i+" ");
            i += 3;
            n--;
        }
    }
}