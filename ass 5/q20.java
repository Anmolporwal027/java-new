// 0	7	14	21	28	35	…..
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want series like 0 7	14	21	28	35	...");
        int n = sc.nextInt();
        for(int i=0; n != 0; n--){
            System.out.print(i+" ");
            i+=7;
        }
    }
}