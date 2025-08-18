import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter celcius to convert in fahrenheit");
        double c = sc.nextDouble();
        double f = c * 9f/5f + 32;
        System.out.println(c+" celcius in fahrenheit is : "+f);
    }
}