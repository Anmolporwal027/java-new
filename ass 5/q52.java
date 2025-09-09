// 52) WAP to find out all the Armstrong numbers between two entered numbers\
import java.util.Scanner;
class Q52{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers of 3 digit between you want armstrongs ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            int j = i;
            int sum = 0;
            while(j != 0){
                int rem = j%10;
                sum += rem*rem*rem;
                j = j/10;
            }
            if(sum == i){
                System.out.println("Armstrong number : "+i);
            }
        }
    }
}