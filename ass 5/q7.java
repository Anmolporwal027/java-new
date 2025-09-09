//Check no is prime or not
import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check");
        int n = sc.nextInt();
        boolean flag = true;
        for(int i=2; i<n; i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("Given no "+n+" is prime number");
        else
            System.out.println("Given no "+n+" is not a prime number");

    }
}