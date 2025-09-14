import java.util.Scanner;
class TestMain{

    void perfect(int num){
      int sum=0;

      for(int i=1; i<=num/2; i++){
        if(num%i == 0){
            sum += i;
        }
      }

      if(sum == num){
        System.out.print(num + " is a perfect Number");
      }
      else{
        System.out.print(num + " is not a perfect Number");

      }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        TestMain que = new TestMain();
        que.perfect(num);
    }
}