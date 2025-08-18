// 42. WAP to round off all the numbers which lies in between 1 to 4 digit numbers.
import java.util.Scanner;
class TestMain{
        public int check(int n){
            int m = n/10;
            m *= 10;
            if(n-m <= 5){
                return m;
            }
            else{
                return m+10;
            }
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to 4 digit number ");
        int n = sc.nextInt();

        TestMain t = new TestMain();
        System.out.println("Round off of number "+n+" is "+t.check(n));
    }
}