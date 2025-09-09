// WAP to check whether entered number is perfect or not
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number to check perfect or not ");
        int n = sc.nextInt();
        for(int i=1; i<n; i++){
            if(n%i == 0)
                sum += i;
        }
        if(sum == n)
            System.out.println("Given number "+n+" is a perfect number ");
        else    
            System.out.println("Given number "+n+" is not a perfect number ");
    }
}