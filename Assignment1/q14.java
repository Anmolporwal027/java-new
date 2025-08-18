import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 Subjects ");
        int total = 0;
        for(int i=0; i<5; i++){
            total += sc.nextInt();
        }
        System.out.println("Total marks of 5 sub "+total);
        float per = (float)(total/5f);
        System.out.println("Percentage "+per);
    }
}