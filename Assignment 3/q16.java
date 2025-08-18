import java.util.Scanner;
class TestMain{
    public void check(int a , int b,int c){
        if(a==b && a==c){
            System.out.println("All three are equal");
        }
        else{
            System.out.println("Bigger number is : "+((a>b)?(a>c?a:c):(b>c?b:c)));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        TestMain t = new TestMain();
        t.check(a,b,c);
    }
}