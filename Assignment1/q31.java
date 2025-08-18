import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no of days");
        int days = sc.nextInt();
        int years = days/365;
        int remaining = days % 365;
        int weeks = remaining/7;
        remaining = remaining%7;
        days = remaining;
        System.out.println("Years "+years);
        System.out.println("Weeks "+weeks);
        System.out.println("Days "+days);
    }
}