import java.util.Scanner;

class TestMain {
    int arr[];

    void ascending() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void descending() {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
        if (args.length < 1) {
            System.out.println("no element present");
            return;
        }

        System.out.println("Enter 1. asending 2.desending");
        int choice = sc.nextInt();
        int size = args.length ;
        TestMain obj = new TestMain();
        obj.arr = new int[size];

        for (int i = 0; i < args.length; i++) {
            obj.arr[i] = Integer.parseInt(args[i]);
        }

        switch (choice) {
            case 1:
                obj.ascending();
                System.out.println("Array in Ascending order:");
                obj.printArray();
                break;

            case 2:
                obj.descending();
                System.out.println("Array in Descending order:");
                obj.printArray();
                break;

            default:
                System.out.println("Invalid choice! Use 1 for Ascending, 2 for Descending.");
        }
    }
}