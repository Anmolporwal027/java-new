// 64 , 36
import java.util.Scanner;
class TestMain{
    public void check(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        int ch = sc.next().charAt(0);
        if(ch == 64 || ch == 36)
            System.out.println("Entered character is $ or @");
        else
            System.out.println("Entered character is not $ or @");
    }

    public static void main(String args[]){
        TestMain t = new TestMain();
        t.check();
    }
}