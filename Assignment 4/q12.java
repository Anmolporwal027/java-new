// 12) WAP to handle rental system(Home, Vehicle etc)
import java.util.Scanner;
class Home{
    int house[];

    void houseRent(int house[]){
    this.house = house;
    Scanner sc = new Scanner(System.in);
    System.out.println("For how many months you want to rent a Home");
    int month = sc.nextInt();

    System.out.println("Enter 1 for 1Rk ");
    System.out.println("Enter 2 for 1BHK ");
    System.out.println("Enter 3 for 2BHK ");
    System.out.println("Enter 4 for 3BHK ");
    int choice = sc.nextInt();
    switch(choice){
        case 1:
            System.out.println("Your total rent of 1Rk for "+month+"month is "+(month * house[choice-1]));
            break;
        case 2:
            System.out.println("Your total rent of 2BHK for "+month+"month is "+(month * house[choice-1]));
            break;
        case 3:
            System.out.println("Your total rent of 3BHK for "+month+"month is "+(month * house[choice-1]));
            break;
        case 4:
            System.out.println("Your total rent of 4BHK for "+month+"month is "+(month * house[choice-1]));
            break;
        default:
            System.out.println("Enter correct value ");
    }
    System.out.println("Thanks for Renting Home");
    }
}
class Vehicle{
    int v[];

    void vehiclerent(int[] v){
    this.v = v;
    Scanner sc = new Scanner(System.in);
    System.out.println("For how many days you want to rent a Vehicle");
    int day = sc.nextInt();

    System.out.println("Enter 1 for Bike ");
    System.out.println("Enter 2 for Sports Bike ");
    System.out.println("Enter 3 for Car ");
    System.out.println("Enter 4 for Racing Car ");
    int choice = sc.nextInt();
    switch(choice){
        case 1:
            System.out.println("Your total rent of Bike for "+day+" day is "+(day * v[choice-1]));
            break;
        case 2:
            System.out.println("Your total rent of Sports Bike for "+day+" day is "+(day * v[choice-1]));
            break;
        case 3:
            System.out.println("Your total rent of Car for "+day+" day is "+(day * v[choice-1]));
            break;
        case 4:
            System.out.println("Your total rent of Racing Car for "+day+" day is "+(day * v[choice-1]));
            break;
        default:
            System.out.println("Enter correct value ");
    }
    System.out.println("Thanks for Renting vehicle");
    }
}
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int house[] = {5000,8000,10000,15000};
        int vehicle[] = {1000,2000,5000,10000};

        System.out.println("1. Home Rent \n 2. Vehicle Rent ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                Home h = new Home();
                h.houseRent(house);
                break;
            case 2:
                Vehicle v = new Vehicle();
                v.vehiclerent(vehicle);
                break;
            default:
                System.out.println("Enter corrcet choice");
                break;
        }
    }
}