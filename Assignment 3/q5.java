import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character ");
        int c = sc.next().charAt(0);
        if(c >= 48 && c <=57)
            System.out.println("Given charavter is number");
        else 
            System.out.println("Given character is not number");

    }
}