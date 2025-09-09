import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A and B ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println("Enter + for addition ");
        System.out.println("Enter - for substraction ");
        System.out.println("Enter * for multiplication ");
        System.out.println("Enter / for division ");
        System.out.println("Enter % for Modulo ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '+':
                System.out.println(A+"+"+B+" = "+(A+B));
                break;
            case '-':
                System.out.println(A+"-"+B+" = "+(A-B));
                break;
            case '*':
                System.out.println(A+"*"+B+" = "+(A*B));
                break;
            case '/':
                System.out.println(A+"/"+B+" = "+(A/B));
                break;
            case '%':
                System.out.println(A+"%"+B+" = "+(A%B));
                break;
            default:
                System.out.println("Enter correct input for operation");
        }
    }
}