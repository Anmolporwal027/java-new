import java.util.Scanner;
class TestMain{
    public void check(int a){
        if(a%75==0){
            System.out.println("number is divisible by 75");
        }
        else{
            System.out.println("number is not  divisible by 75");
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