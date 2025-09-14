import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter 5 elements");
        for(int i=0; i<5; i++){
            arr[i]=sc.nextInt();

        }

        for(int i=0; i<5/2; i++){
            int temp = arr[i];
            arr[i] = arr[5-i-1];
            arr[5-i-1] = temp;
        }

        for(int i=0; i<5; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
