import java.util.Scanner;
class TestMain{

    void fibo(int num){
        int n1 = 0;
        int n2 = 1;
        System.out.print("0 1 ");
        for(int i=1; i<=num-2; i++){
        int n3 = n1 + n2;
        System.out.print(n3 + " ");
        n1 = n2;
        n2 = n3;

        }
    }
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number : ");
    int num = sc.nextInt();

    TestMain f = new TestMain();
    f.fibo(num);
    }
}