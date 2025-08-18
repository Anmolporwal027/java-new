/*
    31. WAP to interchange second and last second digit of a 5 digit number
Ex: 23123 O/p: 22133

 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5 digit number");
        int n=sc.nextInt();
        int first = n/10000;
        int firsts = n/1000;
        firsts = firsts%10;
        int middle = n/100;
        middle = middle%10;
        int lasts = n/10;
        lasts = lasts%10;
        int last  = n%10;
        int replaced = first*10000+lasts*1000+middle*100+firsts*10+last;
        System.out.println(replaced);
    }
}