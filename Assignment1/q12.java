import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character ");
        int c = sc.next().charAt(0);
        c = c + 32;
        System.out.println("After converting it in lowercase "+((char)c));


    }
}