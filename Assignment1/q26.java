// meter to feet

import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter meters to convert in feet ");
        int m = sc.nextInt();
        float f = (float)m * 3.280f;
        System.out.println("meters converted into feet : "+f);
    }
}

