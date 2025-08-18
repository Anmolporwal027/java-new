/*
    37. Write a program for generating electricity Bill. Accept last month unit and current monthunit from user, then calculate and print bill amount according to following condition
    For units
    0-100 charges 2 rs/unit
    101-200 charges 3rs/unit
    201-300 4rs/unit
    >300 charges 5rs/unit
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last month and current month unit");
        int lastm = sc.nextInt();
        int currm = sc.nextInt();
        int unit = currm - lastm;
        int total = 0;
        if(unit >=0 && unit <=100){
            total = unit *2;
        }
        else if(unit >= 101 && unit <= 200){
            total = 100*2 + (unit - 100)*3;
        }
        else if(unit >= 201 && unit <= 300){
            total = 100*2+100*3+(unit-200)*4; 
        }
        else if(unit > 300){
            total = 100*2+100*3+100*4+(unit-300)*5;
        }
        System.out.println("Your total unit is "+unit+" and Total bill is "+total);
    }
}