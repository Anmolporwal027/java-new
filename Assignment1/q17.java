import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character ");
        int c = sc.next().charAt(0);
        boolean chk = (c>=65 && c <=90 || c >= 97 && c<=122)?true:false;
        if(chk) 
            System.out.println(((char)c)+" is Alphabet");
        else
            System.out.println(((char)c)+" is not Alphabet");


    }
}