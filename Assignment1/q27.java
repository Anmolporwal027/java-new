// feet to meter
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feet to convert in meters ");
        int f = sc.nextInt();
        float m = (float)(f * 0.3048f);
        System.out.println("meters converted into feet : "+m);
    }
}