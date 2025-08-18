import java.util.Scanner;
class TestMain{
    public void check(int a){
        if(a%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        

        TestMain t = new TestMain();
        t.check(a);
    }
}q