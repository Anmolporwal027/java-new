// 5) WAP to create a menu and find out area of circle, square, rectangle and trapezium 
import java.util.Scanner;
class TestMain{
        static float area(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the radius of circle ");
            float r = sc.nextFloat();
            return 3.14f * r * r ;
        }
        static int square(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter one side of square ");
            int s = sc.nextInt();
            return (s*s);
        }
        static int rectangle(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter length ");
            int l = sc.nextInt();
            System.out.println("Enter breadth ");
            int b = sc.nextInt();
            return (l*b);
        }
        static float trapezium(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter base 1 ");
            float b1 = sc.nextFloat();
            System.out.println("Enter base 2 ");
            float b2 = sc.nextFloat();
            System.out.println("Enter height ");
            float h = sc.nextFloat();
            return (0.5f*(b1+b2)*h);
        }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to find area of circle ");
        System.out.println("Enter 2 to find area of square ");
        System.out.println("Enter 3 to find area of rectangle ");
        System.out.println("Enter 4 to find area of trapezium ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Area of the circle is : "+area());
                break;
            case 2:
                System.out.println("Area of the square is : "+square());
                break;
            case 3:
                System.out.println("Area of the rectangle is : "+rectangle());
                break;
            case 4:
                System.out.println("Area of the trapezium is : "+trapezium());
                break;
            default:
                System.out.println("Enter correct choice ");
        }
    }
}