import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some statement");
        String s = sc.next();

        for(int i=0; i<1000; i++){
           System.out.println(s);
        }
    }
}