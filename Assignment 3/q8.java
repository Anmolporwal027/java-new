import java.util.Scanner;
class TestMain{
    public void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        int ch = sc.next().charAt(0);
        if(ch >= 97 && ch <= 122){
            System.out.println("Entered character is Lowercase");
            ch = ch-32;
            System.out.println("Entered character after converting in Uppercase "+((char)ch));
        }
        else
            System.out.println("Entered character is not Lowercase ");
    }

    public static void main(String args[]){
        TestMain t = new TestMain();
        t.check();
    }
}