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
        System.out.println("Enter 3 digit number ");
        int n = sc.nextInt();

        TestMain t = new TestMain();
        System.out.println("Round off of 3 digit number "+n+" is "+t.check(n));
    }
}