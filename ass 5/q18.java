//1	 2	 2	 4	 8	 32	 …… 

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want series 1 2 2 4 8 32.....");
        int n = sc.nextInt();
        int a = 1;
        int b = 2;
        int c = 0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        while( n != 2){
            c = a*b;
            System.out.print(c+" ");
            a = b;
            b = c;
            n--;
        }
    }
}