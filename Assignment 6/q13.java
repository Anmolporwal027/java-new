import java.util.Scanner;


class TestMain{

    public static void main(String args[]){

    Scanner sc =  new Scanner(System.in);
    double sum = 0;
    int arr[] = new int[5];
    for(int i=0; i<5; i++){
      arr[i] = sc.nextInt();
      sum += arr[i];
    }

    double avg = sum/5;
    System.out.println("Average of 5 numbres are "+avg);
  }
}