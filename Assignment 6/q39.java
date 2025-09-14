import java.util.Scanner;

class TestMain{
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter Array size : ");
    int size  = sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter Array elements : ");
    for(int i=0; i<size; i++){
        arr[i] = sc.nextInt();
    }

    System.out.print("Enter delete position : ");
    int position = sc.nextInt();

    for(int i=position-1; i<size-1; i++){
        arr[i] = arr[i+1];
    }
    size--;
 
    System.out.println("After deleted Array elements.... ");
    for(int i=0; i<size; i++){
        System.out.print(arr[i] + " ");
    }
 }
}