//WAP to find out HCF of a number
import java.util.Scanner;
class Q42{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 ");
        int b = sc.nextInt();

        int lower = (a<b)?a:b;
        int cf = 0;
        for(int i=1; i<=lower; i++){
            if(a%i == 0 && b%i == 0){
                cf = i;
            }
        }
        System.out.println("HCF = "+cf);

    }
}