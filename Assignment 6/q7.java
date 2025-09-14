import java.util.Scanner;
class TestMain {
    int arr[];

    void ascending() {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    void descending() {
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
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
