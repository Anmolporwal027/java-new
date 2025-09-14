import java.util.Scanner;

class TestMain{
    void Table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        TestMain obj = new TestMain();
        obj.Table(n);
    }
}
