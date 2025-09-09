// 26) 0	8	64	216 ....
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want even number cubes");
        int n = sc.nextInt();
        for(int i=0; n != 0; n--){
            System.out.print((i*i*i)+" ");
            i += 2;
        }
    }
}