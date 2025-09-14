import java.util.Scanner;

class TestMain {

    void One(int n) {
        int num=0;
        for (int i = 0; i < n; i++) {
            num = num * 10 + 1;
            System.out.print(num + " + ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        TestMain obj = new TestMain();
        obj.One(n);
    }
    }
