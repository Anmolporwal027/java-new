import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1 ");
        int a = sc.nextInt();
        System.out.println("Enter no 2 ");
        int b = sc.nextInt();

        System.out.println("ALL Relational operations ");
        System.out.println("a > b "+(a>b));
        System.out.println("a < b : "+(a<b));
        System.out.println("a >= b : "+(a>=b));
        System.out.println("a <= b  "+(a<=b));
        System.out.println("a == b "+(a==b));
        System.out.println("a != b "+(a!=b));
    }
}