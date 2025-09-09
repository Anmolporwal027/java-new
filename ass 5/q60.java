//60) WAP to print Square, Cube and Square Root of all numbers from 1 to N
import java.util.Scanner;
class Q60{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        for(int i=1 ; i<=n; i++){
            System.out.println("Square : "+(i*i));
            System.out.println("Cube : "+(i*i*i));
            System.out.println("Square root : "+Math.sqrt(i));
        } 
    }
}