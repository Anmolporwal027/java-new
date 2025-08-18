import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1  ");
        int a = sc.nextInt();
        System.out.println("Enter no 2  ");
        int b = sc.nextInt();

        if(a == b)
            System.out.println("Both the numbers are equal");
        else if(a>b)
            System.out.println("A is big");
        else 
            System.out.println("B is big");
    }
}