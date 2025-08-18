// 25) Program to convert persons height from inches to cm
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in inches ");
        int hei = sc.nextInt();
        float cm = (float)hei * 2.54f;
        System.out.println("Height in cm : "+cm);
    }
}

