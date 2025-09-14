import java.util.Scanner;

class TestMain{
    void check(int arr[], int n) {
        boolean flag = true;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Array is Palindrome");
        } else {
            System.out.println("Array is Not Palindrome");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TestMain obj = new TestMain();
        obj.check(arr, n);
    }
}
