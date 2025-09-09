import java.util.Scanner;
class test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for table");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=10; i++){
            System.out.println(n+" x "+i+" = "+ (n*i));
        }
    }
}