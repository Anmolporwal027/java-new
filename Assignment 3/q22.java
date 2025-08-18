/*
    22) The project basically gives the user the option to ask if he is renting a car [Y or N]:
    if Y is inputed, then it ask about "C” for Compact or “F” for Full-size,
    if the user selects compact the project displays that the user has selected compact and
    if the code displays fullsize the project displays that the user has selected fullsize.
    Then it asks the user if they have a coupon or not by “Y” or “N” if the users answer Y for the coupon the price is 7% off on 456.56 for compact car.
    If the user answers N the price is a normal 456.56. The fullsize normal price is 460.50 and the price with a coupon is 7% off on 460.50.

 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you renting a car Y/N");
        char ch = sc.next().charAt(0);
        double price = 0;
        if(ch == 'Y'){
            System.out.println("Enter C for compact or F for full size");
            char ch1 = sc.next().charAt(0);
            if(ch1 == 'C'){
                System.out.println("User has selected compact");
                price = 456.56;
            }
            else if(ch1 == 'F'){
                System.out.println("User has selected Full size");
                price = 460.50;
            }else {
                System.out.println("Invalid car type selected.");
                sc.close();
                return;
            }

            System.out.println("Do you have coupon Y/N");
            char ch3 = sc.next().charAt(0);
            if(ch3 == 'Y' && ch1 == 'C'){
                price *= 0.93;
                System.out.println("Total price of car rental with compact size with coupon : "+price);
            }
            else if(ch3 == 'Y' && ch1 == 'F'){
                price *= 0.93;
                System.out.println("Total price of car rental with Full size with coupon : "+price);
            }
            else if(ch3 == 'N' && ch1 == 'F'){
                System.out.println("Total price of car rental with Full size without coupon : "+price);
            }
            else if(ch3 == 'N' && ch1 == 'C'){
                System.out.println("Total price of car rental with compact without coupon  : "+price);
            }
        }
        else{
            System.out.println("Ok so you dont want to rent a car");
        }
    }
}