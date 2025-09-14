import java.util.Scanner;

class TestMain {
    void Even(int n) {
        System.out.println("First " + n + " Even Numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print((2 * i) + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        TestMain obj = new TestMain();
        obj.Even(n);
    }
}
