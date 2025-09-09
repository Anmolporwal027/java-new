// WAP to check whether entered number is strong or not
import java.util.Scanner;
class Q39{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check it is strong or not ");
        int n = sc.nextInt();
        int sum = 0;
        int m = n;
        while(m != 0){
            int rem = m%10;
            int fact = 1;
            for(int i=1; i<=rem; i++){
                fact = fact*i;
            }
            sum += fact;
            m = m/10;
        }
        if(n == sum)
            System.out.println(n+" is a strong number");
        else 
            System.out.println(n+" is not a strong number");
    }
}