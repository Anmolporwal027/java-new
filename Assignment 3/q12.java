import java.util.Scanner;
class TestMain{
    public void check(int a){
        if(a>=0){
            System.out.println("number is +ve");
        }
        else{
            System.out.println("number is -ve");
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