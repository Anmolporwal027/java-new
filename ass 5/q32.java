// A	b	C	d	E	f	G	h
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want the series ");
        int n = sc.nextInt();
        for(int i=65; n!=0; i+=2){
            char c = (char)i;
            System.out.print(c+" ");
            c += 33;
            System.out.print(c+" ");
            n--;
        }
    }
}