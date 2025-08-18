/*
    20) Program to get marks of 5 subjects from user and find out its grade using nested if else
    Per>=75 && per<=100 Grade A
    Per>=60 && per<75 Grade B
    Per>=50 && per<60 Grade C
    Per>=33 && per<50 Grade D
    else Fail
    Do Same with else if ladder.

 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 subjects marks");
        int total = 0;
        for(int i=0; i<5; i++){
            total += sc.nextInt();
        }
        float Per = (float)total/5f;
        if(Per <= 33){
            System.out.println("FAIL");
        }
        else if(Per>=33 && Per<50){
            System.out.println("Grade D");
        }
        else if(Per>=50 && Per<60){
            System.out.println("Grade c");
        }
        else if(Per>=60 && Per<75){
            System.out.println("Grade b");
        }
        else if(Per >=75 && Per <=100){
            System.out.println("Grade A");
        }q
    }
}