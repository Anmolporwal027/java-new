import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter milimeters to convert in inches ");
        float m = sc.nextFloat();

        float i = m/25.4f;
        System.out.println("Inches converted : "+i);
    }
}