import java.util.Scanner;

class TestMain{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter three numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

System.out.println("Greatest number: "+((a > b) ? ( (a > c) ? a : c ) : ( (b > c) ? b : c )));


}
}