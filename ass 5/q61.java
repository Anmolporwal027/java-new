// 61) WAP to find out all the leap years between two entered years
import java.util.Scanner;
class Q61{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number till you want to check leap years ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=a; i<=b; i++){
            if( (i % 4 == 0 && i%100 != 0) || (i%400 == 0 )){
                System.out.println("Leap year "+i);
            }
        }
    }
}