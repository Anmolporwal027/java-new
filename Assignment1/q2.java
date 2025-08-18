import java.util.Scanner;
class q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pricipel ");
        int p = sc.nextInt();
        System.out.println("Enter rate ");
        int r = sc.nextInt();
        System.out.println("Enter time ");
        int t = sc.nextInt();

        double SI = (p*r*t)/100;
    }
}