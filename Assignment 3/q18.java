import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year ");
        int y = sc.nextInt();

        if(y%4 == 0){
            if(y%100!=0)
                System.out.println("Year is leap "+y);
            else if(y%400 == 0)
                System.out.println("Year is leap "+y);
            else
                System.out.println("Year is not leap "+y);
        }
        else{
            System.out.println("Year is not leap "+y);
        }

    }
}