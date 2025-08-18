import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 5; 
        int b = 2;
        System.out.println("Before swapping A = "+a+" and B = "+b);
        a = a+b;
        b =  a-b; 
        a = a-b;
        System.out.println("After swapping A = "+a+" and B = "+b);


    }
}