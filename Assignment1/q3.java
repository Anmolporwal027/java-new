import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fahrenheit to convert in celcius");
        double f = sc.nextDouble();
        float c = (float)((f-32)*(5f/9f));
        System.out.println(f+" fahrenheit converted into celcius is "+c);
    }
}