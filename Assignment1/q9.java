import java.lang.Math;
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side one ");
        double a = sc.nextDouble();
        System.out.println("Enter side two ");
        double b = sc.nextDouble();
        System.out.println("Enter side three ");
        double c = sc.nextDouble();

        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area by herons formula : "+area);
    }
}