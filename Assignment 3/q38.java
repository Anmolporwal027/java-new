/*
    38. Write a program to enter three subject marks (out of 100). Check if student is pass or Fail,only if he/she scores greater than 75 in each subject and the average of all three subject marks should also be greater than 80.
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of all three");
        boolean score = false;
        int total = 0;
        for(int i=1; i<=3; i++){
            System.out.println("Enter mark of subject "+i);
            int mark = sc.nextInt();
            total += mark;
            if(mark >=75)
                score = true;
            else   
                score = false;
        }
        if(score && (total/3) >= 80)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}