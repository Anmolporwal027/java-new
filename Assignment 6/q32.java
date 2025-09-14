import java.util.Scanner;

class TestMain {

    void Nine(int n) {
        int res=0;
        for (int i = 1; i <= n; i++) {
            res = res * 10 + 9;
            System.out.print(res + " + ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        TestMain obj = new TestMain();
        obj.Nine(n);
    }
    }