import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers you want odd ");
        int n = sc.nextInt();
        for(int i=1; n!=0; n--,i+=2){
            System.out.print(i+" ");
        }
    }
}