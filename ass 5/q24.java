// 0	4	16	36	64
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want even number squares");
        int n = sc.nextInt();
        for(int i=0; n!=0; n--){
            System.out.print(i*i+" ");
            i+=2;
        }
    }
}