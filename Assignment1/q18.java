import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character ");
        int c = sc.next().charAt(0);
        boolean chk = (c>=65 && c <=90)?true:false;
        if(chk){
            System.out.println("character "+((char)c)+" is Uppercase");
            c += 32;
            System.out.println("After converting in lowercase "+(char)c);
        }
        else
            System.out.println("character "+((char)c)+" is not Uppercase");

        

    }
}