import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a 5 digit number ");
        int n = sc.nextInt();
        int lastdigit = n%10;
        int firstdigit = n/10000;
        n = n/10;
        int middle = n%1000;
       
        int replaced = ((lastdigit*1000)+middle)*10+firstdigit;
        System.out.println("replacing 1st and last digit  "+replaced);
    }
}