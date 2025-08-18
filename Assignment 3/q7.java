import java.util.Scanner;
class TestMain{
    public void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        int ch = sc.next().charAt(0);
        if(ch >= 65 && ch <= 90){
            System.out.println("Entered character is Uppercase");
            ch = ch+32;
            System.out.println("Entered character after converting in lowercase "+((char)ch));
        }
        else
            System.out.println("Entered character is not Uppercase ");
    }

    public static void main(String args[]){
        TestMain t = new TestMain();
        t.check();
    }
}