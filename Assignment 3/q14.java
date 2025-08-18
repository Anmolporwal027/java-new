import java.util.Scanner;
class TestMain{
    public void check(int a , int b){
        if(a%b==0){
            System.out.println(a+" is divisible by "+b);
        }
        else{
            System.out.println(a+" is not divisible by "+b);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();

        TestMain t = new TestMain();
        t.check(a,b);
    }
}