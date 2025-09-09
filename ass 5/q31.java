// 9	99	999	9999	  99999 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want 9  99	999	9999  99999 .");
        int n = sc.nextInt();
        for(int i=0; n != 0; n--){
            i = (i*10)+9;
            System.out.print(i+" ");
        }
    }
}