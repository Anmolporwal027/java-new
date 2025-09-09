import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want fibonacci ");
        int n = sc.nextInt();
        int a = -1;
        int b = 1;
        int c;
        while(n != 0){
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            n--;
        }
    }
}