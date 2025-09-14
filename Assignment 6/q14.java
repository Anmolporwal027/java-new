import java.util.Scanner;
class TestMain{

    void SI(int principle , int Rate , int Time){
        double Si = (principle * Rate * Time)/100;
        System.out.println("Simple Intrest : " + Si);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle : ");
        int principle = sc.nextInt();

         System.out.print("Enter Rate : ");
        int Rate = sc.nextInt();

         System.out.print("Enter Time : ");
        int Time = sc.nextInt();

        TestMain t = new TestMain();
        t.SI(principle,Rate,Time);

    }
}