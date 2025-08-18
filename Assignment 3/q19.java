import java.util.Scanner;
class TestMain{
    int getAge(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        return sc.nextInt();
    }
    void check(char c){
        if(c == 'i' || c == 'I'){
            System.out.println("You are indian");
            if(getAge() > 18)
                System.out.println("Eligible for vote");
            else    
                System.out.println("Not ligible for vote");
        }
        else
            System.out.println("You are not indian");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter (i/I) to check nationality");
        char c = sc.next().charAt(0);

        TestMain t = new TestMain();
        t.check(c);
    }
}