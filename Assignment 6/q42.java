import java.util.Scanner;

class TestMain{
    int arr[];

    
    void ascending() {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    
    void descending() {
        for (int i = 0; i < arr.length - 1; i++) {
            int largest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[largest] < arr[j]) {
                    largest = j;
                }
            }
            int temp = arr[largest];
            arr[largest] = arr[i];
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

        TestMain obj = new TestMain(); 

        System.out.print("Enter array size : ");
        int size = sc.nextInt();

        obj.arr = new int[size];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            obj.arr[i] = sc.nextInt();
        }

        System.out.println("What you want: ");
        System.out.println("1. Ascending order ");
        System.out.println("2. Descending order ");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

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
                System.out.println("Invalid choice!");
        }
    }
}