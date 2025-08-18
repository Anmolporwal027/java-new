import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for sum");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a-(-b);
        System.out.println("SUm of 2 numbers is "+sum);
    }
}