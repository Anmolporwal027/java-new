/*
8) WAP to create a medical equipment menu for retailer and whole seller where retailers sees only 5 medicines and purchase of medicine units is not more than 5 whereas wholesaler sees list of 10 medicines and purchase of units is not more than 100 , prices of medicine would be in double.
*/
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String medicine[] = {
            "Paracetamol", "Dolo", "Crocin", "Cough Syrup", "Disprin",
            "Avil", "Antibiotic", "Insulin", "ORS", "Pain"
        };
        double price[] = {10, 15, 20, 35, 5, 8, 50, 2, 12, 60};

        System.out.println("Enter : 1 for Retailer, 2 for Wholeseller");
        int cust = sc.nextInt();

        int maxmedi = (cust == 1)?5:10;
        int maxunit = (cust == 1)?5:100;
        double totalCost = 0;

    while(true){
        double cost = 0;
        for(int i=0; i<maxmedi; i++){
            System.out.println("Enter "+(i+1)+" for "+medicine[i]);
        }
        System.out.println("Enter "+(maxmedi+1)+" for Exit");
        System.out.println("Enter your choice ");
        int choice = sc.nextInt();

        if(choice < 1 || choice >maxmedi+1){
            System.out.println("Invalid Choice ! ");
            continue;
        }
        if(choice == maxmedi+1){
            break;
        }
        System.out.println("Enter units ");
        int units = sc.nextInt();

        if(units > maxunit){
            System.out.println("You can only buy "+maxunit);
            continue;
        }
        cost = price[choice-1]*units;
        System.out.println("Added "+medicine[choice-1]+" x "+units+" = "+cost);
        totalCost += cost;
    }
    System.out.println("Total cost "+totalCost);
        
    }
}