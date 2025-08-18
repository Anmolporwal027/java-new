import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1 ");
        int a = sc.nextInt();
        System.out.println("Enter no 2 ");
        int b = sc.nextInt();

        System.out.println("ALL Arithmatic operations ");
        System.out.println("sum : "+(a+b));
        System.out.println("subtraction : "+(a-b));
        System.out.println("multiplication : "+(a*b));
        System.out.println("division  "+(a/b));
        System.out.println("modulo "+(a%b));
    }
}