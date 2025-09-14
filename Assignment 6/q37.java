import java.util.Scanner;


class TestMain{
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];

         for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int num = arr[i];
            int rev = 0;
            while (num > 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            arr[i] = rev; 
        }

        
        System.out.println("Array after reversing individual elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

