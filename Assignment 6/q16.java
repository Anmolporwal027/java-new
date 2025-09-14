import java.util.Scanner;

class TestMain{

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter two numbers: ");
int a = sc.nextInt();
int b = sc.nextInt();

if(a==b){
    System.out.println("Both number are equal");
}
else{
    System.out.println("Greatest number: "+((a>b)?a:b));
}

}
}