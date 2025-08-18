import java.util.Scanner;
class TestMain{
        public void check(int n){
            int e = 0 , o = 0;
            while(n != 0){
                if(n%2 == 0)
                    e++;
                else
                    o++;
                n /= 10;
            }
            System.out.println("Even = "+e+" Odd = "+o);
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 digit number ");
        int n = sc.nextInt();

        TestMain t = new TestMain();
        t.check(n);
    }
}