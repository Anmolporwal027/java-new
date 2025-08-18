import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 5 Subjects ");
        int total = 0;
        for(int i=0; i<5; i++){
            total += sc.nextInt();
        }
        float per = (float)(total/5f);
        if(per >= 75 && per <= 100)
            System.out.println(" yes Percentage "+per);
        else    
            System.out.println(" No Percentage "+per);
    }
}