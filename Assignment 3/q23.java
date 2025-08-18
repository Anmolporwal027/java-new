// 23. A cashier has some amount of money(e.g. 4526).Write a program to calculate out how many currency of Rs.1000,Rs.500,Rs100, Rs50, Rs20, Rs10, Rs5, Rs2, Rs1 required.
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total amount ");
        int n = sc.nextInt();
        int thousand =0, fivehundred=0 , hundred=0 , fifty=0,twenty=0,ten=0,five=0,two=0,one=0;
        if(n > 1000){
            thousand = n/1000;
            n = n%1000;
            fivehundred = n/500;
            n = n%500;
            hundred = n/100;
            n = n%100;
            fifty = n/50;
            n = n%50;
            twenty = n/20;
            n = n%20;
            ten = n/10;
            n = n%10;
            five = n/5;
            n = n%5;
            two = n/2;
            n = n%2;
            one = n;
        }
        System.out.println("Thousand : "+thousand);
        System.out.println("five hundered : "+fivehundred);
        System.out.println("hundered : "+hundred);
        System.out.println("fifty : "+fifty);
        System.out.println("twenty : "+twenty);
        System.out.println("Ten : "+ten);
        System.out.println("five : "+five);
        System.out.println("Two : "+two);
        System.out.println("one : "+one);
    }
}