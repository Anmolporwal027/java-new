import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 number of subjects");
        int total = 0;
        for(int i=1; i<=5; i++){
            total += sc.nextInt();
        }
        int avg = total/5;
        System.out.println("Average of marks of 5 no are "+avg);
    }
}