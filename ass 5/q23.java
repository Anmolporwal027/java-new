// 23) 1	9	25	49	81...
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want 1	9	25	49	81.... ");
        int n = sc.nextInt();

        for(int i=1; n!= 0; n--){
            System.out.print(i*i+" ");
            i+=2;
        }
    }
}