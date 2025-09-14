import java.util.Scanner;

class TestMain {
    void factors(int n) {
        System.out.println("Factors of " + n + " are:");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        TestMain obj = new TestMain();
        obj.factors(n);
    }
}
