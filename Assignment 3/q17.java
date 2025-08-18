import java.util.Scanner;
class TestMain{
    public void check(int ch){
        if(ch >=32 && ch<=47 || ch>=58 && ch <= 64 || ch >=91 && ch<=96 || ch>=123 && ch<=126){
            System.out.println("character "+((char)ch)+" is special");
        }
        else{
            System.out.println("character "+((char)ch)+" is not special");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check that it is in range of special character or not ");
        int ch = sc.next().charAt(0);

        TestMain t = new TestMain();
        t.check(ch);
        

    }
}