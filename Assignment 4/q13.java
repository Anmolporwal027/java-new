// 13) WAP to create JMB MENU CARD
import java.util.Scanner;
class TestMain{
    static int total = 0;
    void calculate(String item,int price,int units){
        total += price * units;
        System.out.println("\nItem : "+units+" "+item+" added\n Total "+total);
    }
    public static void main(String args[]){
        TestMain t = new TestMain();
        Scanner sc = new Scanner(System.in);
        String Item[] = {"Pizza","Burger","cold-drink","sweet","sandwitch"};
        int price[] = {200,150,80,100,70};

        while(true){
            System.out.println("Select the menu item");
            for(int i=0; i<5; i++){
                System.out.println("Enter "+(i+1)+" for "+Item[i]+" price : "+price[i]);
            }
            System.out.println("Enter 6 for exit ");
            int n = sc.nextInt();
            
            int units = 0;
            switch(n){
                case 1:
                    System.out.println("Enter units ");
                    units = sc.nextInt();
                    t.calculate(Item[0],price[0],units);
                    break;
                case 2:
                    System.out.println("Enter units ");
                    units = sc.nextInt();
                    t.calculate(Item[1],price[1],units);
                    break;
                case 3:
                    System.out.println("Enter units ");
                    units = sc.nextInt();
                    t.calculate(Item[2],price[2],units);
                    break;
                case 4:
                    System.out.println("Enter units ");
                    units = sc.nextInt();
                    t.calculate(Item[3],price[3],units);
                    break;
                case 5:
                    System.out.println("Enter units ");
                    units = sc.nextInt();
                    t.calculate(Item[4],price[4],units);
                    break;
                case 6:
                    System.out.println("Thanks for shopping ");
                    return;
                default:
                    System.out.println("Enter the correct choice ");
                    break;
           }
        }
        System.out.println("Total Bill Is : "+t.total);
    }
}