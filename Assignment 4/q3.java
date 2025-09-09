import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character ");
        char ch = sc.next().charAt(0);
        if((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch=='o')||(ch=='u')){
            System.out.println("Character is vowel ");
        }
        else{
            System.out.println("Character is not vowel ");
        }
    }
}