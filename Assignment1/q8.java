import java.util.Scanner;
import java.lang.Math;
class CI{
    private float A;
    private float CI;
    public float calculate(float p ,float r ,float t){
        CI = (float)(((Math.pow(1 + (r/100),t))*p)-p);
        return CI; 
    }
}
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        float p = sc.nextFloat();
        System.out.println("Enter rate ");
        float r = sc.nextFloat();
        System.out.println("Enter time ");
        float t = sc.nextFloat();

        CI c = new CI();
        System.out.println("Compount interest is : "+c.calculate(p , r , t));
    }
}