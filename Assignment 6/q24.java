import java.util.Scanner;

class TestMain {
    void sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of " + n + " natural numbers: " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        TestMain obj = new TestMain();
        obj.sum(n);
    }
}
