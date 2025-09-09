//WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
class Q40{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int evencnt = 0;
        int oddcnt = 0;
        int m = n;
        while(n != 0){
            int rem = n%10;
            if(rem % 2 == 0)
                evencnt++;
            else
                oddcnt++;

            n = n/10;
        }
        System.out.println("The odd and even in "+m+" is even : "+evencnt+" and odd "+oddcnt);
    }
}