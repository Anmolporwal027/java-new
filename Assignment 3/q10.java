import java.util.Scanner;
class TestMain{
    public void check(int a , int b){
        if(a==b){
            System.out.println("Btoh are equal");
        }
        else{
            System.out.println("Bigger number is : "+((a>b)?a:b));
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