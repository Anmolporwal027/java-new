import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to checkk");
        int year = sc.nextInt();

        boolean check = ((year % 4 == 0 && year % 100 != 0) ||year % 400 == 0)?true:false;
        if(check)
            System.out.println(year+" is leap year ");
        else 
            System.out.println(year+" is not leap year ");
    }
}