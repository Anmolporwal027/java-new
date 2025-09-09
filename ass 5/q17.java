// 1 	2	 4	 7	 11	 16 	…… n terms

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want series 1 2 4 7 11 16.....");
        int n = sc.nextInt();
        int series = 1;
       for(int i=1; i<=n; i++){
        System.out.print(series+" ");
        series = series + i;
       }
    }
}