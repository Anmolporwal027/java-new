/*
    7) WAP to enter source, destination,date, day and time and creates a menu for reservation where user needs to select vehicle type then selects no. Of seats for males, females and children and also calculate the fare according to senior citizen criteria. Note : No bookings will be considered for Saturday and Sunday 
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source ");
        String src = sc.nextLine();
        System.out.println("Enter destination ");
        String dest = sc.nextLine();
        System.out.println("Enter date ");
        String date = sc.nextLine();
        System.out.println("Enter day ");
        String day = sc.nextLine();

        if(day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")){
            System.out.println("Booking will not considered for this day");
        }
        else{
            System.out.println("Enter 1. for train ");
            System.out.println("Enter 2. for bus ");
            System.out.println("Enter 3. for flight ");
            int n = sc.nextInt();

            int total = 0;
            int mseat=0;
            int fseat=0;
            int cseat=0;
            int sseat=0;
            switch(n){
                case 1:
                    System.out.println("Enter no of seates for male ");
                    mseat = sc.nextInt();
                    System.out.println("Enter no of seates for Female ");
                    fseat = sc.nextInt();
                    System.out.println("Enter no of seates for children ");
                    cseat = sc.nextInt();
                    System.out.println("Enter no of seats for senior citizen ");
                    sseat = sc.nextInt();

                    total = ((mseat + fseat + cseat)*100) + (sseat * 80);
                    break;

                case 2:
                    System.out.println("Enter no of seates for male ");
                    mseat = sc.nextInt();
                    System.out.println("Enter no of seates for Female ");
                    fseat = sc.nextInt();
                    System.out.println("Enter no of seates for children ");
                    cseat = sc.nextInt();
                    System.out.println("Enter no of seats for senior citizen ");
                    sseat = sc.nextInt();

                    total = ((mseat + fseat + cseat)*200) + (sseat * 180);
                    break;

                case 3:
                    System.out.println("Enter no of seates for male ");
                    mseat = sc.nextInt();
                    System.out.println("Enter no of seates for Female ");
                    fseat = sc.nextInt();
                    System.out.println("Enter no of seates for children ");
                    cseat = sc.nextInt();
                    System.out.println("Enter no of seats for senior citizen ");
                    sseat = sc.nextInt();

                    total = ((mseat + fseat + cseat)*1000) + (sseat * 800);
                    break;
                
                default:
                    System.out.println("Enter correct mode of travel");
            }
            System.out.println("Congratulations your bookings are confirmend !");
            System.out.println("Source : "+src+"      to       Destination :   "+dest);
            System.out.println("Time -> 2:30pm");
            System.out.println("Total price with senior citizen fare : "+total);

        }
    }
}