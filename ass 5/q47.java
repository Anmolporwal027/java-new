// 47) WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
class Q47{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers so you got tables of all number between them ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            for(int j = 1; j<=10; j++){
                System.out.println(i+" x "+j+" = "+(i*j));
            }
            System.out.println();
        }
    }
}