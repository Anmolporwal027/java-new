import java.util.Scanner;
class TestMain{
    public void check(int a){
        if(a >= 50 && a <= 100){
            System.out.println("YES no lies between 50 to 100");
        }
        else{
            System.out.println("NO no lies between 50 to 100");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        

        TestMain t = new TestMain();
        t.check(a);
    }
}