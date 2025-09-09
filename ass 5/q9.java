import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want Even");
        int n = sc.nextInt();
        int x = 0;
        while(n != 0){
            System.out.print(x+" ");
            x += 2;
            n--;
        }
    }
}