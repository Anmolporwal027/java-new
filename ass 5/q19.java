// 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number till you want sum of this series 1	+ 1/2 + 1/3 + 1/4 + 1/5 ...n ");
        int n = sc.nextInt();
        float sum = 0;
        for(int i=1; n!= 0; n--){
            sum += (float)1/i;
            i++;
        }
        System.out.println("SUM => "+sum);
    }
}