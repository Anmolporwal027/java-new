import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a 6 digit number ");
        int n = sc.nextInt();
        int lastdigit = n%10;
        int firstdigit = n/100000;
        System.out.println("The sum of first and last digit is "+(lastdigit+firstdigit));
    }
}