import java.util.Scanner;

class TestMain{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Array elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Insert position : ");
        int position = sc.nextInt();
        System.out.print("Enter Insert element : ");
        int element = sc.nextInt();

        int newarr[] = new int[size + 1];

        for (int i = 0; i < position - 1; i++) {
            newarr[i] = arr[i];
        }

        newarr[position - 1] = element;

        for (int i = position; i < newarr.length; i++) {
            newarr[i] = arr[i - 1];
        }

        System.out.println("Array after insertion: ");
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
