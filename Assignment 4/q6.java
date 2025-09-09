// 6) WAP to create a menu of 5 items regarding spare parts of a vehicle and take individually the units and price of each part and then find out the total cost.
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    int cost = 0;
    while(true){
        System.out.println("Enter 1 for tyre ");
        System.out.println("Enter 2 for battery ");
        System.out.println("Enter 3 for staring ");
        System.out.println("Enter 4 for engine ");
        System.out.println("Enter 5 for breaks ");
        System.out.println("Enter 6 if you putted all your parts ")
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("Enter units of tyre ");
                int tunit = sc.nextInt();
                System.out.println("Enter the price of tyre ");
                int tprice = sc.nextInt();
                cost += tunit * tprice;
                break;

            case 2:
                System.out.println("Enter units of battery ");
                int bunit = sc.nextInt();
                System.out.println("Enter the price of battery ");
                int bprice = sc.nextInt();
                cost += bunit * bprice;
                break;

            case 3:
                System.out.println("Enter units of staring ");
                int sunit = sc.nextInt();
                System.out.println("Enter the price of staring ");
                int sprice = sc.nextInt();
                cost += sunit * sprice;
                break;

            case 4:
                System.out.println("Enter units of engine ");
                int eunit = sc.nextInt();
                System.out.println("Enter the price of engine ");
                int eprice = sc.nextInt();
                cost += eunit * eprice;
                break;

            case 5:
                System.out.println("Enter units of clutch ");
                int cunit = sc.nextInt();
                System.out.println("Enter the price of clutch ");
                int cprice = sc.nextInt();
                cost += cunit * cprice;
                break;

            case 6:
                System.out.println("Thankyou , Exiting menu...");
                System.out.println("Total price of your selected parts are "+cost);
                return;
            
            default:
                System.out.println("Enter correct number ");
                break;
        }
    }
    }
}