import java.util.Scanner;
import javax.swing.*;
class BreakFast{
    Scanner sc = new Scanner(System.in);
    public static final String RED_TEXT = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String BLACK_TEXT = "\u001B[30m";
    public static final String WHITE_BG = "\u001B[47m";
    public static final String GREEN = "\u001B[102m";
    public final static String BLUE_TEXT = "\u001B[44m";
    public static final String WHITE_TEXT = "\u001B[37m";
    public static final String LIGHT_BLUE_BG = "\u001B[104m";
    public static final String VERY_LIGHT_BLUE_BG = "";
    public static final String BG_MAROON = "\u001B[48;5;52m";
    public static final String BG_BEIGE = "\u001B[48;5;230m";

    static String[] Aitems = {"1   Poha", "1   Jalebi", "1   Bread Item", "1   Tea","1   Biscuit"};
    static String[] Bitems = {"1   Poha", "1   Jalebi", "1   Bread Item", "1   Heavy Snaks","1   Tea"};
    static String[] Citems = {"1   Poha", "1   Jalebi", "1   Bread Item", "2   Heavy Snaks","1   Coffee"};

    void showBreakfast(){
        double Price;
        String name;
        long num;
        int quantity;
        while (true) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid input! Name should contain only alphabets. Try again.");
            }
        }
        while (true) {
            System.out.print("Enter your Mobile number: ");
            
            // Check if the input is a valid number first
            if (sc.hasNextLong()) { 
                num = sc.nextLong();
                
                // Convert the number to a String to check its length
                String numStr = String.valueOf(num);
                
                // Check if the length is exactly 10
                if (numStr.length() == 10) {
                    System.out.println("Valid mobile number entered: " + num);
                    break; // Exit the loop on success
                } else {
                    System.out.println("Invalid input! Please enter a 10-digit number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); // Consume the invalid input to prevent an infinite loop
            }
        }
      
        while (true) {
                 System.out.println("Enter for how many perons you want Thalis");
                if (sc.hasNextInt()) { // check if input is an integer
                    quantity = sc.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter numbers only.");
                    sc.next();
                }
            }
        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
        System.out.printf((TestMain.BG_MAROON+TestMain.WHITE_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                          "A Rs(200/-)","B Rs(230/-)" ,"C Rs(250/-)");

        for(int i=0; i<Citems.length; i++){
            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                              Aitems[i],Bitems[i],Citems[i]);
        }
        double gst;
        System.out.println("Enter your choice (A/B/C)");
        char choice = sc.next().charAt(0);

        switch(choice){
            // for first category of breakfast
            case 'A':
                Price = quantity * 200;
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((BG_MAROON + WHITE_TEXT)+"| %-7s %-27s %-9s %-12s |"+RESET+"%n","Name   : ",name, "Number       : ",num);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                               BreakFast                            |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 BILL                               |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_MAROON+TestMain.WHITE_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                          "Name","Price" ,"Quantity");
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                              "Basic BreakFast ","200",quantity);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-45s|"+TestMain.RESET+"%n", 
                              "Items ","   ");
                            //   to show bill items
                 for(int i=0; i<Aitems.length; i++){
                    System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-45s|"+TestMain.RESET+"%n", 
                              Aitems[i],"   ");
                 }
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "Price ",Price);
                 gst = Price * 18/100;
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "GST(18%) ",gst);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "Total Bill ",gst+Price);
                break;

            // for Scond category of breakfast
            case 'B':
                Price = quantity * 230;
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((BG_MAROON + WHITE_TEXT)+"| %-7s %-27s %-9s %-12s |"+RESET+"%n","Name   : ",name, "Number       : ",num);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                               BreakFast                            |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 BILL                               |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_MAROON+TestMain.WHITE_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                          "Name","Price" ,"Quantity");
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                              "Delux BreakFast ","230",quantity);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-45s|"+TestMain.RESET+"%n", 
                              "Items ","   ");
                            //   to show bill items
                 for(int i=0; i<Bitems.length; i++){
                    System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-45s|"+TestMain.RESET+"%n", 
                              Bitems[i],"   ");
                 }
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "Price ",Price);
                gst = Price * 18/100;
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "GST(18%) ",gst);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "Total Bill ",gst+Price);

                break;
  
            // for third category of breakfast
            case 'C':
                Price = quantity * 250;
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((BG_MAROON + WHITE_TEXT)+"| %-7s %-27s %-9s %-12s |"+RESET+"%n","Name   : ",name, "Number       : ",num);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                               BreakFast                            |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 BILL                               |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_MAROON+TestMain.WHITE_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                          "Name","Price" ,"Quantity");
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                              "Permium BreakFast ","250",quantity);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-45s|"+TestMain.RESET+"%n", 
                              "Items ","   ");
                            //   to show bill items
                 for(int i=0; i<Citems.length; i++){
                    System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-45s|"+TestMain.RESET+"%n", 
                              Citems[i],"   ");
                 }
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "Price ",Price);
                 gst = Price * 18/100;
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "GST(18%) ",gst);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "Total Bill ",gst+Price);

                break;

        }

    }
}

class Thali{
        
        public static final String RED_TEXT = "\u001B[31m";
        public static final String RESET = "\u001B[0m";
        public static final String BLACK_TEXT = "\u001B[30m";
        public static final String WHITE_BG = "\u001B[47m";
        public static final String GREEN = "\u001B[102m";
        public final static String BLUE_TEXT = "\u001B[44m";
        public static final String WHITE_TEXT = "\u001B[37m";
        public static final String LIGHT_BLUE_BG = "\u001B[104m";
        public static final String VERY_LIGHT_BLUE_BG = "";
        public static final String BG_MAROON = "\u001B[48;5;52m";
        public static final String BG_BEIGE = "\u001B[48;5;230m";

        Scanner sc = new Scanner(System.in);
        String Thalis[] = {"Thali A","Thali B","Thali C","Thali D","Thali E","Thali F"};
        String ThalisP[] = {"Rs. 310/-","Rs. 360/-","Rs. 410/-","Rs. 480","Rs. 600/-","Rs. 700/-"};
        String A[] = {"1 Soup or Welcome Drink","2 Vegetable Dish"," ","1 Dal","1 Rice","1 Sweet Dish","Roti , Naan ","Butter Paratha","Pickle , Salad , Papad"};
        String ThaliA[] = {"1 Soup or Welcome Drink","2 Vegetable Dish","1 Dal","1 Rice"};
        String ThaliA1[] = {"Roti , Naan ","Butter Paratha","Pickle , Salad , Papad","1 Sweet Dish"};

        String B[] = {"1 Soup or Welcome Drink","2 Vegetable Dish","","1 Dal","1 Rice","1 Paneer Dish","1 Sweet Dish or Ice-Cream","Roti , Butter Naan ","Butter Paratha","Pickle , Salad , Papad"};
        String ThaliB[] = {"1 Soup or Welcome Drink","1 Paneer Dish","2 Vegetable Dish","1 Dal","1 Rice"};
        String ThaliB1[] = {"Roti , Butter Naan ","Butter Paratha","Pickle , Salad , Papad","1 Sweet Dish or Ice-Cream",""};
    
        String ThaliC[] = {"1 Soup or Welcome Drink","1 Starter","1 Paneer Dish","2 Vegetable Dish","1 Curd Dish","1 Dal"};
        String ThaliC1[] = {"1 Rice","Roti , Butter Naan ","Butter Paratha","Pickle , Salad , Papad","1 Sweet Dish or Ice-Cream",""};
        String C[] = {"1 Soup or Welcome Drink","1 Starter","1 Paneer Dish","2 Vegetable Dish","","1 Curd Dish","1 Dal","1 Rice","1 Sweet Dish or Ice-Cream","Roti , Butter Naan ","Butter Paratha","Pickle , Salad , Papad"};

        String ThaliD[] = {"1 Soup or Welcome Drink","2 Starter","1 Paneer Dish","2 Vegetable Dish","1 Curd Dish","1 Dal"};
        String ThaliD1[] = {"1 Rice","Roti,Butter Naan,Butter Paratha","Pickle , Salad , Papad","1 Sweet Dish/Coffee/ice Cream","",""};
        String D[] = {"1 Soup or Welcome Drink","2 Starter","","1 Paneer Dish","2 Vegetable Dish","","1 Curd Dish","1 Dal","1 Rice","1 Sweet Dish/Coffee/Ice Cream","Roti,Butter Naan,Butter Paratha","Pickle,Salad,Papad"};

        String ThaliE[] = {"1 Soup or Welcome Drink","2 Starter","1 Paneer Starter","1 Pasta(1 Type)","1 Paneer Dish","2 Vegetable Dish",""};
        String ThaliE1[] = {"1 Curd Dish","1 Dal","1 Rice","Roti , Naan , Paratha","Pickle , Salad , Papad","1 Sweet Dish","1 Coffee or Ice-Cream"};
        String E[] = {"1 Soup or Welcome Drink","2 Starter","","1 Paneer Starter","1 Pasta(1 Type)","1 Paneer Dish","2 Vegetable Dish","","1 Curd Dish","1 Dal","1 Rice","1 Sweet Dish","1 Coffee or Ice-Cream","Roti , Naan , Paratha","Pickle , Salad , Papad"};

        String ThaliF[] = {"2 Soup","1 Welcome Drink","3 Starter","1 Paneer Starter","1 Chinese Dish","1 Paneer Dish","2 Vegetable Dish"};
        String ThaliF1[] = {"1 Curd Dish","1 Dal","1 Rice","Roti,Naan,Paratha","Pickle , Salad , Papad","2 Sweet Dish","1 Ice-Cream"};
        String F[] = {"2 Soup","","1 Welcome Drink","3 Starter","","","1 Paneer Starter","1 Chinese Dish","1 Paneer Dish","2 Vegetable Dish","","1 Curd Dish","1 Dal","1 Rice","2 Sweet Dish","","1 Ice-Cream","Roti,Naan,Paratha","Pickle , Salad , Papad"};

        String soup[] = {"Tomato Soup","Veg Mancho","Hot & Sour Veg","Lemon Coriander"};

        String Vegetable1[] = {"Nav Ratan Korma","Lahori Aloo with Mutte","Mix Veg","Green Chana","Corn Palak","Aloo 65","Aloo Mutter","Aloo Capsicum","Aloo Do Pyaza","Aloo Gobhi","Gobhi Mutter","Kadi Punjabi","Veg Kofta"};
        String Vegetable2[] = {"Methi Mutter Malai","Haryali Kofta","Chana Masala","Bhindi Masala","Jeera Aloo","Dum Aloo","Gujrati Aloo","Tinda Masala","Aloo Palak","Seasonal Veg","Bhindi Do Pyaza","Veg. Kolhapuri","Corn Capsicum"};

        String Starter1[] = {"Mix Veg Pakoda","Veg Finger","Bread Pakoda","Methi Kabab","Moong Pakoda","Dragon Aloo","Saboo Dana","Finger Chips","Aloo Corn Kabab"};
        String Starter2[] = {"Veg Cutlet","Veg Kothey","Hara Bhara Kabab","Corn Chat","Aloo Chat","Saboo Dana vada","Veg Manchurian Dry","Tandoori Manchurian","Chinese Corn Kebab"};

        String Dal[] = {"Dal fry","Dal Tadka","Dal Makhni","Dal Panchrangi"};
        String Rice[] = {"Normal rice","Jeera Rice","Veg Pulao","Veg Fried Rice","Veg Briyani"};

        String PaneerDish1[] = {"Paneer Butter Masala","Paneer Punjabi","Paneer Mutter","Paneer Do Pyaza","Paneer Tikka Masala"};
        String PaneerDish2[] = {"Paneer Kadai","Methi Paneer","Corn Paneer","Paneer Kolhapuri","Paneer Chatpata"};
        String PaneerStarter[] = {"Paneer Chilli","Paneer Tikka","Dragon Paneer","Paneer 65","Paneer Pudina Tikka","Paneer Achari Tikka"};
        String CurdDish[] = {"Veg raita","Loki Raita","Aloo Raita","Dahi Papdi","Boondi Raita","Fruit Raita","Dahi Vada"};
        String Sweet[] = {"Gulab Jamun","Gajar ka Halwa","Moong ka Halwa","Shree Khand"};
        String IceCream[] = {"Vanilla","Butter Scotch","ChocoBar"};
        String Chinese[] = {"Backed Veg","Veg Manchurain","Veg noodles","Backed Palak","Singapore noodle","Veg fried Rice"};
        
        //PERSON INFORMATION
        String name;
        long num;
        int totalPerson ;
        // To show all thalis
        void showThali(){
        while (true) {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid input! Name should contain only alphabets. Try again.");
            }
        }
         while (true) {
            System.out.print("Enter your Mobile number: ");
            
            // Check if the input is a valid number first
            if (sc.hasNextLong()) { 
                num = sc.nextLong();
                
                // Convert the number to a String to check its length
                String numStr = String.valueOf(num);
                
                // Check if the length is exactly 10
                if (numStr.length() == 10) {
                    System.out.println("Valid mobile number entered: " + num);
                    break; // Exit the loop on success
                } else {
                    System.out.println("Invalid input! Please enter a 10-digit number.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); // Consume the invalid input to prevent an infinite loop
            }
        }
             while (true) {
                 System.out.println("Enter for how many perons you want Thalis");
                if (sc.hasNextInt()) { // check if input is an integer
                    totalPerson = sc.nextInt();
                    break;
                } else {
                    System.out.println("Invalid input! Please enter numbers only.");
                    sc.next();
                }
            }

            System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            System.out.printf((TestMain.BG_MAROON + TestMain.WHITE_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "Thali Name","Price ");
            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");

            for(int i=0; i<Thalis.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Thalis[i],ThalisP[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }

            System.out.println("Enter your choice for thali (1 to 6)");
            int thaliChoice = sc.nextInt();
            ShowSpecificThali(thaliChoice);
        }   
            // To show Specific Thali and Items of it
            void ShowSpecificThali(int thali){
                switch(thali){
                    case 1:
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                               THALI A                              |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<ThaliA1.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                            ThaliA[i],ThaliA1[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 |                                  |"+RESET);
                        }
                        ThaliA();
                        break;
                    case 2:
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                               THALI B                              |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<ThaliB.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                            ThaliB[i],ThaliB1[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 |                                  |"+RESET);
                        }
                        ThaliB();
                        break;

                    case 3:
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                               THALI C                              |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<ThaliC.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                            ThaliC[i],ThaliC1[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 |                                  |"+RESET);
                        }
                        ThaliC();
                        break;

                    case 4:
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                               THALI D                              |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<ThaliD1.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                            ThaliD[i],ThaliD1[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 |                                  |"+RESET);
                        }
                        ThaliD();
                        break;
                    
                    
                    case 5:
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                               THALI E                              |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<ThaliE1.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                            ThaliE[i],ThaliE1[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 |                                  |"+RESET);
                        }
                        ThaliE();
                        break;

                    case 6:
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                               THALI F                              |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<ThaliF1.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                            ThaliF[i],ThaliF1[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 |                                  |"+RESET);
                        }
                        ThaliF();
                        break;

                    default:
                        System.out.println("Enter Correct choice please!");
                        break;
                }
            }
        // To Get the selected items of Thali A
        void ThaliA(){
            //FOR SOUP OR WELCOME DRINK
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose 1st Item                           "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"         1.Welcome Drink                             2. Soup          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println("Enter your choice");
            int Wsoup = sc.nextInt();
            String ThaliAChoosed[] = new String[9];

            // Option for soup and welcome drink
            switch(Wsoup){
                case 1:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                    You Added Welcome Drink Thanks !                  "+RESET);
                    ThaliAChoosed[0] = " Roafza";
                    System.out.println("You choosed "+ThaliAChoosed[0]);
                    break;
                case 2:
                        // show soup items
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 Soup                               |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<soup.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            soup[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
                        System.out.println("Enter Your choice of soup (1-4)");
                        int soupchoice = sc.nextInt();
                        ThaliAChoosed[0] = soup[soupchoice-1];
                        System.out.println("You choosed "+ThaliAChoosed[0]);
                        // for(String a : ThaliAChoosed){
                        //     System.out.println(a);
                        // }
                    break;

                default:
                    System.out.println("Enter correct choice ");
                    break;
            }

            //FOR VEGETABLE 1
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose 1st Vegetable                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                                 Vegetable                            "+RESET);
            for(int i=0; i<Vegetable1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Vegetable1[i],Vegetable2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-26)");
            int v1choice = sc.nextInt();
      
            if(v1choice < 14){
                ThaliAChoosed[1] = Vegetable1[v1choice-1];
                System.out.println("You choosed "+ThaliAChoosed[1]+" as your vegetable 1 ");
            }
            else{
                if(v1choice == 26){
                    ThaliAChoosed[1] = Vegetable2[12];
                }
                else{
                    ThaliAChoosed[1] = Vegetable2[(v1choice%13)-1];
                }
                System.out.println("You choosed "+ThaliAChoosed[1]+" as your vegetable 1 ");
            }
    
            System.out.println("Enter your choice for vegetable 2 (1-26)");
            int v2choice = sc.nextInt();
            while(v1choice == v2choice){
                System.out.println("Dont enter same vegetabe l as before");
                v2choice = sc.nextInt();
            }   
                if(v2choice == 26){
                    ThaliAChoosed[2] = Vegetable2[12];
                    System.out.println("You choosed "+ThaliAChoosed[2]+" as your vegetable 2 ");
                }
                else{
                    if(v2choice < 14){
                        ThaliAChoosed[2] = Vegetable1[v2choice-1];
                        System.out.println("You choosed "+ThaliAChoosed[2]+" as your vegetable 2 ");
                    }
                else{
                    ThaliAChoosed[2] = Vegetable2[(v2choice%13)-1];
                    System.out.println("You choosed "+ThaliAChoosed[2]+" as your vegetable 2 ");
                }
            }
        
        
            // Enter Dal 
             System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Dal                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Dal.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Dal[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-4)");
            int Dalchoice = sc.nextInt();
            ThaliAChoosed[3] = Dal[Dalchoice-1];
            System.out.println("You Choosed "+ThaliAChoosed[3]);

            // FOR RICE
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Rice                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Rice.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Rice[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            }
            System.out.println("Enter your choice (1-5)");
            int Ricechoice = sc.nextInt();
            ThaliAChoosed[4] = Rice[Ricechoice-1];
            System.out.println("You Choosed "+ThaliAChoosed[4]);

            // FOR SWEET
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Sweet                             "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Sweet.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Sweet[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            }
            System.out.println("Enter your choice (1-4)");
            int Sweetchoice = sc.nextInt();
            ThaliAChoosed[5] = Sweet[Sweetchoice-1];
            System.out.println("You Choosed "+ThaliAChoosed[5]);

            // Remaining fixed items
            ThaliAChoosed[6] = "Roti , Naan ";
            ThaliAChoosed[7] = "Butter Paratha ";
            ThaliAChoosed[8] = "Pickle, Salad, Papad";

            // Showing choosed thali items
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                               Thali A                                "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Selected Item                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<A.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                A[i],ThaliAChoosed[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter 1 for printing bill");
            int finalbill = sc.nextInt();
            while(finalbill != 1){
                System.out.println("Enter correct choice");
                finalbill = sc.nextInt();
            }
            PrintBill(310,"Thali A");
        }
        void ThaliB(){
            //FOR SOUP OR WELCOME DRINK
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose 1st Item                           "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"         1.Welcome Drink                             2. Soup          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println("Enter your choice");
            int Wsoup = sc.nextInt();
            String ThaliBChoosed[] = new String[10];

            // Option for soup and welcome drink
            switch(Wsoup){
                case 1:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                    You Added Welcome Drink Thanks !                  "+RESET);
                    ThaliBChoosed[0] = " Roafza";
                    System.out.println("You choosed "+ThaliBChoosed[0]);
                    break;
                case 2:
                        // show soup items
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 Soup                               |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<soup.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            soup[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
                        System.out.println("Enter Your choice of soup (1-4)");
                        int soupchoice = sc.nextInt();
                        ThaliBChoosed[0] = soup[soupchoice-1];
                        System.out.println("You choosed "+ThaliBChoosed[0]);
                        break;

                default:
                    System.out.println("Enter correct choice ");
                    break;
            }

            //FOR VEGETABLE 1
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose 1st Vegetable                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                                Vegetable                             "+RESET);
            for(int i=0; i<Vegetable1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Vegetable1[i],Vegetable2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-26)");
            int v1choice = sc.nextInt();
      
            if(v1choice < 14){
                ThaliBChoosed[1] = Vegetable1[v1choice-1];
                System.out.println("You choosed "+ThaliBChoosed[1]+" as your vegetable 1 ");
            }
            else{
                if(v1choice == 26){
                    ThaliBChoosed[1] = Vegetable2[12];
                }
                else{
                    ThaliBChoosed[1] = Vegetable2[(v1choice%13)-1];
                }
                System.out.println("You choosed "+ThaliBChoosed[1]+" as your vegetable 1 ");
            }
    
            System.out.println("Enter your choice for vegetable 2 (1-26)");
            int v2choice = sc.nextInt();
            while(v1choice == v2choice){
                System.out.println("Dont enter same vegetabe l as before");
                v2choice = sc.nextInt();
            }   
                if(v2choice == 26){
                    ThaliBChoosed[2] = Vegetable2[12];
                    System.out.println("You choosed "+ThaliBChoosed[2]+" as your vegetable 2 ");
                }
                else{
                    if(v2choice < 14){
                        ThaliBChoosed[2] = Vegetable1[v2choice-1];
                        System.out.println("You choosed "+ThaliBChoosed[2]+" as your vegetable 2 ");
                    }
                else{
                    ThaliBChoosed[2] = Vegetable2[(v2choice%13)-1];
                    System.out.println("You choosed "+ThaliBChoosed[2]+" as your vegetable 2 ");
                }
            }
        
        
            // Enter Dal 
             System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Dal                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Dal.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Dal[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-4)");
            int Dalchoice = sc.nextInt();
            ThaliBChoosed[3] = Dal[Dalchoice-1];
            System.out.println("You Choosed "+ThaliBChoosed[3]);

            // FOR RICE
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Rice                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Rice.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Rice[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            }
            System.out.println("Enter your choice (1-5)");
            int Ricechoice = sc.nextInt();
            ThaliBChoosed[4] = Rice[Ricechoice-1];
            System.out.println("You Choosed "+ThaliBChoosed[4]);

            //FOR PANEER DISH
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose Paneer Dish                          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<PaneerDish1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                PaneerDish1[i],PaneerDish2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-10)");
            int Pchoice = sc.nextInt();
            if(Pchoice < 6){
                ThaliBChoosed[5] = PaneerDish1[Pchoice-1];
                System.out.println("You Choosed "+ThaliBChoosed[5]);
            }
            else if(Pchoice == 10){
                ThaliBChoosed[5] = PaneerDish2[4];
                System.out.println("You Choosed "+ThaliBChoosed[5]);
            }
            else{
                ThaliBChoosed[5] = PaneerDish2[(Pchoice%5)-1];
                System.out.println("You Choosed "+ThaliBChoosed[5]);
            }

            // FOR SWEET OR ICE-CREAM
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"          1.Sweet                              2.Ice Cream            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println("Enter your choice (1/2)");
            int Sichoice = sc.nextInt();
            switch(Sichoice){
                case 1:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Sweet                            "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    for(int i=0; i<Sweet.length; i++){
                        System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                Sweet[i]);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    }
                        System.out.println("Enter your choice (1-4)");
                        int Sweetchoice = sc.nextInt();
                        ThaliBChoosed[6] = Sweet[Sweetchoice-1];
                        System.out.println("You Choosed "+ThaliBChoosed[6]);
                        break;

                case 2:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose Ice-Cream                          "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    for(int i=0; i<IceCream.length; i++){
                        System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                IceCream[i]);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    }
                    System.out.println("Enter your choice (1-3)");
                        int Icechoice = sc.nextInt();
                        ThaliBChoosed[6] = IceCream[Icechoice-1];
                        System.out.println("You Choosed "+ThaliBChoosed[6]);
                        break;

            }

            // Remaining fixed items
            ThaliBChoosed[7] = "Roti ,Butter Naan ";
            ThaliBChoosed[8] = "Butter Paratha ";
            ThaliBChoosed[9] = "Pickle, Salad, Papad";

            // Showing choosed thali items
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                               Thali B                                "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Selected Item                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<B.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                B[i],ThaliBChoosed[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter 1 for printing bill");
            int finalbill = sc.nextInt();
            while(finalbill != 1){
                System.out.println("Enter correct choice");
                finalbill = sc.nextInt();
            }
            PrintBill(360,"Thali B");
        }
        void ThaliC(){
            //FOR SOUP OR WELCOME DRINK
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose 1st Item                           "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"         1.Welcome Drink                             2. Soup          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println("Enter your choice");
            int Wsoup = sc.nextInt();
            String ThaliCChoosed[] = new String[12];

            // Option for soup and welcome drink
            switch(Wsoup){
                case 1:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                    You Added Welcome Drink Thanks !                  "+RESET);
                    ThaliCChoosed[0] = " Roafza";
                    System.out.println("You choosed "+ThaliCChoosed[0]);
                    break;
                case 2:
                        // show soup items
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 Soup                               |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<soup.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            soup[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
                        System.out.println("Enter Your choice of soup (1-4)");
                        int soupchoice = sc.nextInt();
                        ThaliCChoosed[0] = soup[soupchoice-1];
                        System.out.println("You choosed "+ThaliCChoosed[0]);
                    break;

                default:
                    System.out.println("Enter correct choice ");
                    break;
            }
            //FOR STARTER
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose Starter                            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<Starter1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Starter1[i],Starter2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-18)");
            int Schoice = sc.nextInt();
            if(Schoice < 10){
                ThaliCChoosed[1] = Starter1[Schoice-1];
                System.out.println("You Choosed "+ThaliCChoosed[1]);
            }
            else if(Schoice == 18){
                ThaliCChoosed[1] = Starter2[8];
                System.out.println("You Choosed "+ThaliCChoosed[1]);
            }
            else{
                ThaliCChoosed[1] = Starter2[(Schoice%9)-1];
                System.out.println("You Choosed "+ThaliCChoosed[1]);
            }

            //FOR PANEER DISH
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose Paneer Dish                          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<PaneerDish1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                PaneerDish1[i],PaneerDish2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-10)");
            int Pchoice = sc.nextInt();
            if(Pchoice < 6){
                ThaliCChoosed[2] = PaneerDish1[Pchoice-1];
                System.out.println("You Choosed "+ThaliCChoosed[2]);
            }
            else if(Pchoice == 10){
                ThaliCChoosed[2] = PaneerDish2[4];
                System.out.println("You Choosed "+ThaliCChoosed[2]);
            }
            else{
                ThaliCChoosed[2] = PaneerDish2[(Pchoice%5)-1];
                System.out.println("You Choosed "+ThaliCChoosed[2]);
            }
            //FOR VEGETABLE 1
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Choose  Vegetable                          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                                Vegetable                             "+RESET);
            for(int i=0; i<Vegetable1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Vegetable1[i],Vegetable2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-26)");
            int v1choice = sc.nextInt();
      
            if(v1choice < 14){
                ThaliCChoosed[3] = Vegetable1[v1choice-1];
                System.out.println("You choosed "+ThaliCChoosed[3]+" as your vegetable 1 ");
            }
            else{
                if(v1choice == 26){
                    ThaliCChoosed[3] = Vegetable2[12];
                }
                else{
                    ThaliCChoosed[3] = Vegetable2[(v1choice%13)-1];
                }
                System.out.println("You choosed "+ThaliCChoosed[3]+" as your vegetable 1 ");
            }
    
            System.out.println("Enter your choice for vegetable 2 (1-26)");
            int v2choice = sc.nextInt();
            while(v1choice == v2choice){
                System.out.println("Dont enter same vegetabe l as before");
                v2choice = sc.nextInt();
            }   
                if(v2choice == 26){
                    ThaliCChoosed[4] = Vegetable2[12];
                    System.out.println("You choosed "+ThaliCChoosed[4]+" as your vegetable 2 ");
                }
                else{
                    if(v2choice < 14){
                        ThaliCChoosed[4] = Vegetable1[v2choice-1];
                        System.out.println("You choosed "+ThaliCChoosed[4]+" as your vegetable 2 ");
                    }
                else{
                    ThaliCChoosed[4] = Vegetable2[(v2choice%13)-1];
                    System.out.println("You choosed "+ThaliCChoosed[4]+" as your vegetable 2 ");
                }
            }
        
            //CURD DISH
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose Curd Dish                            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<CurdDish.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            CurdDish[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-7)");
            int Curdchoice = sc.nextInt();
            ThaliCChoosed[5] = CurdDish[Curdchoice-1];
            System.out.println("You Choosed "+ThaliCChoosed[5]);

            // Enter Dal 
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Dal                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Dal.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Dal[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-4)");
            int Dalchoice = sc.nextInt();
            ThaliCChoosed[6] = Dal[Dalchoice-1];
            System.out.println("You Choosed "+ThaliCChoosed[6]);

            // FOR RICE
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Rice                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Rice.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Rice[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            }
            System.out.println("Enter your choice (1-5)");
            int Ricechoice = sc.nextInt();
            ThaliCChoosed[7] = Rice[Ricechoice-1];
            System.out.println("You Choosed "+ThaliCChoosed[7]);


            // FOR SWEET OR ICE-CREAM
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"          1.Sweet                              2.Ice Cream            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println("Enter your choice (1/2)");
            int Sichoice = sc.nextInt();
            switch(Sichoice){
                case 1:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Sweet                            "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    for(int i=0; i<Sweet.length; i++){
                        System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                Sweet[i]);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    }
                        System.out.println("Enter your choice (1-4)");
                        int Sweetchoice = sc.nextInt();
                        ThaliCChoosed[8] = Sweet[Sweetchoice-1];
                        System.out.println("You Choosed "+ThaliCChoosed[8]);
                        break;

                case 2:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose Ice-Cream                          "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    for(int i=0; i<IceCream.length; i++){
                        System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                IceCream[i]);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    }
                    System.out.println("Enter your choice (1-3)");
                        int Icechoice = sc.nextInt();
                        ThaliCChoosed[8] = IceCream[Icechoice-1];
                        System.out.println("You Choosed "+ThaliCChoosed[8]);
                        break;

            }

            // Remaining fixed items
            ThaliCChoosed[9] = "Roti ,Butter Naan ";
            ThaliCChoosed[10] = "Butter Paratha ";
            ThaliCChoosed[11] = "Pickle, Salad, Papad";

            // Showing choosed thali items
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                               Thali C                                "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Selected Item                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<C.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                C[i],ThaliCChoosed[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter 1 for printing bill");
            int finalbill = sc.nextInt();
            while(finalbill != 1){
                System.out.println("Enter correct choice");
                finalbill = sc.nextInt();
            }
            PrintBill(410,"Thali C");
        }
        void ThaliD(){
            //FOR SOUP OR WELCOME DRINK
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose 1st Item                           "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"         1.Welcome Drink                             2. Soup          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println("Enter your choice");
            int Wsoup = sc.nextInt();
            String ThaliDChoosed[] = new String[12];

            // Option for soup and welcome drink
            switch(Wsoup){
                case 1:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                    You Added Welcome Drink Thanks !                  "+RESET);
                    ThaliDChoosed[0] = " Roafza";
                    System.out.println("You choosed "+ThaliDChoosed[0]);
                    break;
                case 2:
                        // show soup items
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 Soup                               |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<soup.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            soup[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
                        System.out.println("Enter Your choice of soup (1-4)");
                        int soupchoice = sc.nextInt();
                        ThaliDChoosed[0] = soup[soupchoice-1];
                        System.out.println("You choosed "+ThaliDChoosed[0]);
                        // for(String a : ThaliAChoosed){
                        //     System.out.println(a);
                        // }
                    break;

                default:
                    System.out.println("Enter correct choice ");
                    break;
            }
            //FOR STARTER
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose Starter                            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<Starter1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Starter1[i],Starter2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-18)");
            int Schoice = sc.nextInt();
            if(Schoice < 10){
                ThaliDChoosed[1] = Starter1[Schoice-1];
                System.out.println("First Starter You Choosed "+ThaliDChoosed[1]);
            }
            else if(Schoice == 18){
                ThaliDChoosed[1] = Starter2[8];
                System.out.println("First starter You Choosed "+ThaliDChoosed[1]);
            }
            else{
                ThaliDChoosed[1] = Starter2[(Schoice%9)-1];
                System.out.println("First Starter You Choosed "+ThaliDChoosed[1]);
            }

            System.out.println("Enter your choice for 2nd Starter (1-18)");
            int Schoice2 = sc.nextInt();
            while(Schoice2 == Schoice){
                System.out.println("Dont enter same as Starter 1");
                Schoice2 = sc.nextInt();
            }
            if(Schoice < 10){
                ThaliDChoosed[2] = Starter1[Schoice-1];
                System.out.println("First Starter You Choosed "+ThaliDChoosed[1]);
            }
            else if(Schoice == 18){
                ThaliDChoosed[2] = Starter2[8];
                System.out.println("First starter You Choosed "+ThaliDChoosed[1]);
            }
            else{
                ThaliDChoosed[2] = Starter2[(Schoice%9)-1];
                System.out.println("First Starter You Choosed "+ThaliDChoosed[1]);
            }

            //FOR PANEER DISH
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose Paneer Dish                          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<PaneerDish1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                PaneerDish1[i],PaneerDish2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-10)");
            int Pchoice = sc.nextInt();
            if(Pchoice < 6){
                ThaliDChoosed[3] = PaneerDish1[Pchoice-1];
                System.out.println("You Choosed "+ThaliDChoosed[2]);
            }
            else if(Pchoice == 10){
                ThaliDChoosed[3] = PaneerDish2[4];
                System.out.println("You Choosed "+ThaliDChoosed[2]);
            }
            else{
                ThaliDChoosed[3] = PaneerDish2[(Pchoice%5)-1];
                System.out.println("You Choosed "+ThaliDChoosed[2]);
            }
            //FOR VEGETABLE 1
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Choose  Vegetable                          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                                Vegetable                             "+RESET);
            for(int i=0; i<Vegetable1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Vegetable1[i],Vegetable2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-26)");
            int v1choice = sc.nextInt();
      
            if(v1choice < 14){
                ThaliDChoosed[4] = Vegetable1[v1choice-1];
                System.out.println("You choosed "+ThaliDChoosed[4]+" as your vegetable 1 ");
            }
            else{
                if(v1choice == 26){
                    ThaliDChoosed[4] = Vegetable2[12];
                }
                else{
                    ThaliDChoosed[4] = Vegetable2[(v1choice%13)-1];
                }
                System.out.println("You choosed "+ThaliDChoosed[4]+" as your vegetable 1 ");
            }
    
            System.out.println("Enter your choice for vegetable 2 (1-26)");
            int v2choice = sc.nextInt();
            while(v1choice == v2choice){
                System.out.println("Dont enter same vegetabe l as before");
                v2choice = sc.nextInt();
            }   
                if(v2choice == 26){
                    ThaliDChoosed[5] = Vegetable2[12];
                    System.out.println("You choosed "+ThaliDChoosed[5]+" as your vegetable 2 ");
                }
                else{
                    if(v2choice < 14){
                        ThaliDChoosed[5] = Vegetable1[v2choice-1];
                        System.out.println("You choosed "+ThaliDChoosed[5]+" as your vegetable 2 ");
                    }
                else{
                    ThaliDChoosed[5] = Vegetable2[(v2choice%13)-1];
                    System.out.println("You choosed "+ThaliDChoosed[5]+" as your vegetable 2 ");
                }
            }
        
            //CURD DISH
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose Curd Dish                            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<CurdDish.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            CurdDish[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-7)");
            int Curdchoice = sc.nextInt();
            ThaliDChoosed[6] = CurdDish[Curdchoice-1];
            System.out.println("You Choosed "+ThaliDChoosed[6]);

            // Enter Dal 
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Dal                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Dal.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Dal[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-4)");
            int Dalchoice = sc.nextInt();
            ThaliDChoosed[7] = Dal[Dalchoice-1];
            System.out.println("You Choosed "+ThaliDChoosed[7]);

            // FOR RICE
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Rice                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Rice.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Rice[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            }
            System.out.println("Enter your choice (1-5)");
            int Ricechoice = sc.nextInt();
            ThaliDChoosed[8] = Rice[Ricechoice-1];
            System.out.println("You Choosed "+ThaliDChoosed[8]);


            // FOR SWEET OR ICE-CREAM
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"          1.Sweet               2.Ice Cream          3. Coffee        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println("Enter your choice (1/2/3)");
            int Sichoice = sc.nextInt();
            switch(Sichoice){
                case 1:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Sweet                            "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    for(int i=0; i<Sweet.length; i++){
                        System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                Sweet[i]);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    }
                        System.out.println("Enter your choice (1-4)");
                        int Sweetchoice = sc.nextInt();
                        ThaliDChoosed[9] = Sweet[Sweetchoice-1];
                        System.out.println("You Choosed "+ThaliDChoosed[9]);
                        break;

                case 2:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose Ice-Cream                          "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    for(int i=0; i<IceCream.length; i++){
                        System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                IceCream[i]);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    }
                    System.out.println("Enter your choice (1-3)");
                        int Icechoice = sc.nextInt();
                        ThaliDChoosed[9] = IceCream[Icechoice-1];
                        System.out.println("You Choosed "+ThaliDChoosed[9]);
                        break;
                case 3:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                         You Added Coffee Thanks !                    "+RESET);
                    ThaliDChoosed[9] = "Hot Coffee";
                    System.out.println("You choosed "+ThaliDChoosed[9]);
                    break;

            }

            // Remaining fixed items
            ThaliDChoosed[10] = "Roti,Butter Naan,Butter Paratha ";
            ThaliDChoosed[11] = "Pickle,Salad,Papad";

            // Showing choosed thali items
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                               Thali D                                "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Selected Item                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<D.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                D[i],ThaliDChoosed[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter 1 for printing bill");
            int finalbill = sc.nextInt();
            while(finalbill != 1){
                System.out.println("Enter correct choice");
                finalbill = sc.nextInt();
            }
            PrintBill(470,"Thali D");
        }
        void ThaliE(){
           //FOR SOUP OR WELCOME DRINK
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose 1st Item                           "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"         1.Welcome Drink                             2. Soup          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println("Enter your choice");
            int Wsoup = sc.nextInt();
            String ThaliEChoosed[] = new String[15];

            // Option for soup and welcome drink
            switch(Wsoup){
                case 1:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                    You Added Welcome Drink Thanks !                  "+RESET);
                    ThaliEChoosed[0] = " Roafza";
                    System.out.println("You choosed "+ThaliEChoosed[0]);
                    break;
                case 2:
                        // show soup items
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 Soup                               |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<soup.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            soup[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
                        System.out.println("Enter Your choice of soup (1-4)");
                        int soupchoice = sc.nextInt();
                        ThaliEChoosed[0] = soup[soupchoice-1];
                        System.out.println("You choosed "+ThaliEChoosed[0]);
                        // for(String a : ThaliAChoosed){
                        //     System.out.println(a);
                        // }
                    break;

                default:
                    System.out.println("Enter correct choice ");
                    break;
            }
            //FOR STARTER
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose Starter                            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<Starter1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Starter1[i],Starter2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-18)");
            int Schoice = sc.nextInt();
            if(Schoice < 10){
                ThaliEChoosed[1] = Starter1[Schoice-1];
                System.out.println("First Starter You Choosed "+ThaliEChoosed[1]);
            }
            else if(Schoice == 18){
                ThaliEChoosed[1] = Starter2[8];
                System.out.println("First starter You Choosed "+ThaliEChoosed[1]);
            }
            else{
                ThaliEChoosed[1] = Starter2[(Schoice%9)-1];
                System.out.println("First Starter You Choosed "+ThaliEChoosed[1]);
            }

            System.out.println("Enter your choice for 2nd Starter (1-18)");
            int Schoice2 = sc.nextInt();
            while(Schoice2 == Schoice){
                System.out.println("Dont enter same as Starter 1");
                Schoice2 = sc.nextInt();
            }
            if(Schoice2 < 10){
                ThaliEChoosed[2] = Starter1[Schoice2-1];
                System.out.println("Second Starter You Choosed "+ThaliEChoosed[2]);
            }
            else if(Schoice2 == 18){
                ThaliEChoosed[2] = Starter2[8];
                System.out.println("Second starter You Choosed "+ThaliEChoosed[2]);
            }
            else{
                ThaliEChoosed[2] = Starter2[(Schoice2%9)-1];
                System.out.println("Second Starter You Choosed "+ThaliEChoosed[2]);
            }
            
            //FOR PANEER STARTER
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                        Choose Paneer Starter                         "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<PaneerStarter.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                        PaneerStarter[i]);
                System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-6)");
            int Pschoice = sc.nextInt();
            ThaliEChoosed[3] = PaneerStarter[Pschoice-1];

            //PASTA
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Pasta                            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            
            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                        "White sauce");
            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
             System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                        "Red sauce");
            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            System.out.println("Enter your choice (1/2)");
            int Pstachoice = sc.nextInt();
            if(Pstachoice == 1){
                ThaliEChoosed[4] = "White sauce";
                System.out.println("You choosed "+ThaliEChoosed[4]);
            }
            else if(Pstachoice==2){
                ThaliEChoosed[4] = "Red sauce";
                System.out.println("You choosed "+ThaliEChoosed[4]);
            }

            //FOR PANEER DISH
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose Paneer Dish                          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<PaneerDish1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                PaneerDish1[i],PaneerDish2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-10)");
            int Pchoice = sc.nextInt();
            if(Pchoice < 6){
                ThaliEChoosed[5] = PaneerDish1[Pchoice-1];
                System.out.println("You Choosed "+ThaliEChoosed[5]);
            }
            else if(Pchoice == 10){
                ThaliEChoosed[5] = PaneerDish2[4];
                System.out.println("You Choosed "+ThaliEChoosed[5]);
            }
            else{
                ThaliEChoosed[5] = PaneerDish2[(Pchoice%5)-1];
                System.out.println("You Choosed "+ThaliEChoosed[5]);
            }
            //FOR VEGETABLE 1
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Choose  Vegetable                          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                                Vegetable                             "+RESET);
            for(int i=0; i<Vegetable1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Vegetable1[i],Vegetable2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-26)");
            int v1choice = sc.nextInt();
      
            if(v1choice < 14){
                ThaliEChoosed[6] = Vegetable1[v1choice-1];
                System.out.println("You choosed "+ThaliEChoosed[6]+" as your vegetable 1 ");
            }
            else{
                if(v1choice == 26){
                    ThaliEChoosed[6] = Vegetable2[12];
                }
                else{
                    ThaliEChoosed[6] = Vegetable2[(v1choice%13)-1];
                }
                System.out.println("You choosed "+ThaliEChoosed[6]+" as your vegetable 1 ");
            }
    
            System.out.println("Enter your choice for vegetable 2 (1-26)");
            int v2choice = sc.nextInt();
            while(v1choice == v2choice){
                System.out.println("Dont enter same vegetabe l as before");
                v2choice = sc.nextInt();
            }   
                if(v2choice == 26){
                    ThaliEChoosed[7] = Vegetable2[12];
                    System.out.println("You choosed "+ThaliEChoosed[7]+" as your vegetable 2 ");
                }
                else{
                    if(v2choice < 14){
                        ThaliEChoosed[7] = Vegetable1[v2choice-1];
                        System.out.println("You choosed "+ThaliEChoosed[7]+" as your vegetable 2 ");
                    }
                else{
                    ThaliEChoosed[7] = Vegetable2[(v2choice%13)-1];
                    System.out.println("You choosed "+ThaliEChoosed[7]+" as your vegetable 2 ");
                }
            }
        
            //CURD DISH
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose Curd Dish                            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<CurdDish.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            CurdDish[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-7)");
            int Curdchoice = sc.nextInt();
            ThaliEChoosed[8] = CurdDish[Curdchoice-1];
            System.out.println("You Choosed "+ThaliEChoosed[8]);

            // Enter Dal 
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Dal                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Dal.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Dal[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-4)");
            int Dalchoice = sc.nextInt();
            ThaliEChoosed[9] = Dal[Dalchoice-1];
            System.out.println("You Choosed "+ThaliEChoosed[9]);

            // FOR RICE
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Rice                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Rice.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Rice[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            }
            System.out.println("Enter your choice (1-5)");
            int Ricechoice = sc.nextInt();
            ThaliEChoosed[10] = Rice[Ricechoice-1];
            System.out.println("You Choosed "+ThaliEChoosed[10]);

            // FOR SWEET
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Sweet                             "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Sweet.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Sweet[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            }
            System.out.println("Enter your choice (1-4)");
            int Sweetchoice = sc.nextInt();
            ThaliEChoosed[11] = Sweet[Sweetchoice-1];
            System.out.println("You Choosed "+ThaliEChoosed[11]);

            // FOR ICE-CREAM OR COFFEE
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"          1.Ice Cream                                1. Coffee        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println("Enter your choice (1/2)");
            int ICchoice = sc.nextInt();
            switch(ICchoice){
                case 1:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose Ice-Cream                          "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    for(int i=0; i<IceCream.length; i++){
                        System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                IceCream[i]);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    }
                    System.out.println("Enter your choice (1-3)");
                        int Icechoice = sc.nextInt();
                        ThaliEChoosed[12] = IceCream[Icechoice-1];
                        System.out.println("You Choosed "+ThaliEChoosed[12]);
                        break;
                case 2:
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                         You Added Coffee Thanks !                    "+RESET);
                    ThaliEChoosed[12] = "Hot Coffee";
                    System.out.println("You choosed "+ThaliEChoosed[12]);
                    break;

            }

            // Remaining fixed items
            ThaliEChoosed[13] = "Roti,Naan,Paratha";
            ThaliEChoosed[14] = "Pickle,Salad,Papad";

            // Showing choosed thali items
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                               Thali E                                "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Selected Item                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<E.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                E[i],ThaliEChoosed[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter 1 for printing bill");
            int finalbill = sc.nextInt();
            while(finalbill != 1){
                System.out.println("Enter correct choice");
                finalbill = sc.nextInt();
            }
            PrintBill(600,"Thali E");
        }
        void ThaliF(){
            String ThaliFChoosed[] = new String[19];
            // Option for soup 1
            // show soup items
                        System.out.println();
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                 Soup                               |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        for(int i=0; i<soup.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            soup[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
                        System.out.println("Enter Your choice of soup 1 (1-4)");
                        int soupchoice1 = sc.nextInt();
                        ThaliFChoosed[0] = soup[soupchoice1-1];
                        System.out.println("You choosed "+ThaliFChoosed[0]);
                        
                        System.out.println("Enter Your choice of soup 2 (1-4)");
                        int soupchoice2 = sc.nextInt();
                        while(soupchoice1==soupchoice2){
                            System.out.println("Dont enter same soup as before");
                            soupchoice2 = sc.nextInt();
                        }
                            ThaliFChoosed[1] = soup[soupchoice2-1];
                            System.out.println("You Choosed "+ThaliFChoosed[1]);

                    //FOR WELCOME DRINKS
                    System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"|                           Welcome Drink                            |"+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"|                               ITEMS                                |"+RESET);
                    System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                        "Jaljeera");
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                "Roafza");
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    System.out.println("Enter your choice (1/2)");
                    int Welcomechoice = sc.nextInt();

                    if(Welcomechoice == 1){
                        ThaliFChoosed[2] = "Jaljeera";
                        System.out.println("You choosed "+ThaliFChoosed[2]);
                    }
                    else if(Welcomechoice==2){
                        ThaliFChoosed[2] = "Roafza";
                        System.out.println("You choosed "+ThaliFChoosed[2]);
                    }

                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                    You Added Welcome Drink Thanks !                  "+RESET);
                
            //FOR STARTER
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose Starter                            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<Starter1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Starter1[i],Starter2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice for Starter 1 (1-18)");
            int Schoice1 = sc.nextInt();
            if(Schoice1 < 10){
                ThaliFChoosed[3] = Starter1[Schoice1-1];
                System.out.println("First Starter You Choosed "+ThaliFChoosed[3]);
            }
            else if(Schoice1 == 18){
                ThaliFChoosed[3] = Starter2[8];
                System.out.println("First starter You Choosed "+ThaliFChoosed[3]);
            }
            else{
                ThaliFChoosed[3] = Starter2[(Schoice1%9)-1];
                System.out.println("First Starter You Choosed "+ThaliFChoosed[3]);
            }

            System.out.println("Enter your choice for 2nd Starter (1-18)");
            int Schoice2 = sc.nextInt();
            while(Schoice2 == Schoice1){
                System.out.println("Dont enter same as Starter 1");
                Schoice2 = sc.nextInt();
            }
            if(Schoice2 < 10){
                ThaliFChoosed[4] = Starter1[Schoice2-1];
                System.out.println("Second Starter You Choosed "+ThaliFChoosed[4]);
            }
            else if(Schoice2 == 18){
                ThaliFChoosed[4] = Starter2[8];
                System.out.println("Second starter You Choosed "+ThaliFChoosed[4]);
            }
            else{
                ThaliFChoosed[4] = Starter2[(Schoice2%9)-1];
                System.out.println("Second Starter You Choosed "+ThaliFChoosed[4]);
            }

            System.out.println("Enter your choice for 3rd Starter (1-18)");
            int Schoice3 = sc.nextInt();
            while(Schoice1 == Schoice3 || Schoice2 == Schoice3){
                System.out.println("Dont enter same Starter as Before");
                Schoice3 = sc.nextInt();
            }
            if(Schoice3 < 10){
                ThaliFChoosed[5] = Starter1[Schoice3-1];
                System.out.println("Third Starter You Choosed "+ThaliFChoosed[5]);
            }
            else if(Schoice3 == 18){
                ThaliFChoosed[5] = Starter2[8];
                System.out.println("Third starter You Choosed "+ThaliFChoosed[5]);
            }
            else{
                ThaliFChoosed[5] = Starter2[(Schoice3%9)-1];
                System.out.println("Third Starter You Choosed "+ThaliFChoosed[5]);
            }
            
            //FOR PANEER STARTER
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                        Choose Paneer Starter                         "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<PaneerStarter.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                        PaneerStarter[i]);
                System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-6)");
            int Pschoice = sc.nextInt();
            ThaliFChoosed[6] = PaneerStarter[Pschoice-1];

            //CHINESE
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Chinese                           "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            
            for(int i=0; i<Chinese.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                               Chinese[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                "");
            }
            
            System.out.println("Enter your choice (1-6)");
            int chinchoice = sc.nextInt();
            ThaliFChoosed[7] = Chinese[chinchoice-1];

            //FOR PANEER DISH
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose Paneer Dish                          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<PaneerDish1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                PaneerDish1[i],PaneerDish2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-10)");
            int Pchoice = sc.nextInt();
            if(Pchoice < 6){
                ThaliFChoosed[8] = PaneerDish1[Pchoice-1];
                System.out.println("You Choosed "+ThaliFChoosed[8]);
            }
            else if(Pchoice == 10){
                ThaliFChoosed[8] = PaneerDish2[4];
                System.out.println("You Choosed "+ThaliFChoosed[8]);
            }
            else{
                ThaliFChoosed[8] = PaneerDish2[(Pchoice%5)-1];
                System.out.println("You Choosed "+ThaliFChoosed[8]);
            }
            //FOR VEGETABLE 1
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Choose  Vegetable                          "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                               Vegetable                              "+RESET);
            for(int i=0; i<Vegetable1.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                Vegetable1[i],Vegetable2[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter your choice (1-26)");
            int v1choice = sc.nextInt();
      
            if(v1choice < 14){
                ThaliFChoosed[9] = Vegetable1[v1choice-1];
                System.out.println("You choosed "+ThaliFChoosed[9]+" as your vegetable 1 ");
            }
            else{
                if(v1choice == 26){
                    ThaliFChoosed[9] = Vegetable2[12];
                }
                else{
                    ThaliFChoosed[9] = Vegetable2[(v1choice%13)-1];
                }
                System.out.println("You choosed "+ThaliFChoosed[9]+" as your vegetable 1 ");
            }
    
            System.out.println("Enter your choice for vegetable 2 (1-26)");
            int v2choice = sc.nextInt();
            while(v1choice == v2choice){
                System.out.println("Dont enter same vegetabe l as before");
                v2choice = sc.nextInt();
            }   
                if(v2choice == 26){
                    ThaliFChoosed[10] = Vegetable2[12];
                    System.out.println("You choosed "+ThaliFChoosed[10]+" as your vegetable 2 ");
                }
                else{
                    if(v2choice < 14){
                        ThaliFChoosed[10] = Vegetable1[v2choice-1];
                        System.out.println("You choosed "+ThaliFChoosed[10]+" as your vegetable 2 ");
                    }
                else{
                    ThaliFChoosed[10] = Vegetable2[(v2choice%13)-1];
                    System.out.println("You choosed "+ThaliFChoosed[10]+" as your vegetable 2 ");
                }
            }
        
            //CURD DISH
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                          Choose Curd Dish                            "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<CurdDish.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            CurdDish[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-7)");
            int Curdchoice = sc.nextInt();
            ThaliFChoosed[11] = CurdDish[Curdchoice-1];
            System.out.println("You Choosed "+ThaliFChoosed[11]);

            // Enter Dal 
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                              Choose Dal                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Dal.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Dal[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                        }
            System.out.println("Enter your choice (1-4)");
            int Dalchoice = sc.nextInt();
            ThaliFChoosed[12] = Dal[Dalchoice-1];
            System.out.println("You Choosed "+ThaliFChoosed[12]);

            // FOR RICE
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Rice                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Rice.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Rice[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            }
            System.out.println("Enter your choice (1-5)");
            int Ricechoice = sc.nextInt();
            ThaliFChoosed[13] = Rice[Ricechoice-1];
            System.out.println("You Choosed "+ThaliFChoosed[13]);

            // FOR SWEET
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                             Choose Sweet                             "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);

            for(int i=0; i<Sweet.length; i++){
                            System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                            Sweet[i]);
                            System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
            }
            System.out.println("Enter your choice (1-4)");
            int Sweetchoice = sc.nextInt();
            ThaliFChoosed[14] = Sweet[Sweetchoice-1];
            System.out.println("You Choosed "+ThaliFChoosed[14]);
            System.out.println("Enter your choice for sweet 2(1-4)");
            int Sweetchoice2 = sc.nextInt();
            
            while(Sweetchoice == Sweetchoice2){
                System.out.println("Dont enter sweet 2 same as sweet 1");
                Sweetchoice2 = sc.nextInt();
            }
            ThaliFChoosed[15] = Sweet[Sweetchoice-1];
            System.out.println("You Choosed "+ThaliFChoosed[15]);



                    System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    System.out.println((BG_MAROON + WHITE_TEXT)+"                            Choose Ice-Cream                          "+RESET);
                    System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
                    for(int i=0; i<IceCream.length; i++){
                        System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-68s|"+TestMain.RESET+"%n", 
                                IceCream[i]);
                        System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                    }
                    System.out.println("Enter your choice (1-3)");
                        int Icechoice = sc.nextInt();
                        ThaliFChoosed[16] = IceCream[Icechoice-1];
                        System.out.println("You Choosed "+ThaliFChoosed[16]);

            // Remaining fixed items
            ThaliFChoosed[17] = "Roti,Naan,Paratha";
            ThaliFChoosed[18] = "Pickle,Salad,Papad";

            // Showing choosed thali items
            System.out.println();
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Jain Mithai Bhandar                        "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                               Thali F                                "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            System.out.println((BG_MAROON + WHITE_TEXT)+"                           Selected Item                              "+RESET);
            System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                      "+RESET);
            for(int i=0; i<F.length; i++){
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                F[i],ThaliFChoosed[i]);
                System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-33s| %-33s|"+TestMain.RESET+"%n", 
                                "","");
            }
            System.out.println("Enter 1 for printing bill");
            int finalbill = sc.nextInt();
            while(finalbill != 1){
                System.out.println("Enter correct choice");
                finalbill = sc.nextInt();
            }
            PrintBill(700,"Thali F");
        }

        void PrintBill(int price,String Thali){
            System.out.println("Enter Total no of person came in party ");
            int totalPersonA = sc.nextInt();
            double per = totalPerson * 0.10;
            int TotalPrice = 0;
            double gst = 0;
            if(totalPersonA <= (totalPerson+per)){
                TotalPrice = totalPerson*price;
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((BG_MAROON + WHITE_TEXT)+"| %-7s %-27s %-9s %-12s |"+RESET+"%n","Name   : ",name, "Number       : ",num);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                               BILL                                 |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                LUNCH                               |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_MAROON+TestMain.WHITE_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                          "Name","Price" ,"Quantity");
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                              Thali,price,totalPerson);
                
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "TotalPrice ",TotalPrice);
                 gst = TotalPrice*18/100;
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "GST(18%) ",gst);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-43s|%-23s |"+TestMain.RESET+"%n", 
                              "Total Bill ",gst+TotalPrice);
            }
            else{
                TotalPrice = totalPersonA*price;
                System.out.println((BG_MAROON + WHITE_TEXT)+"|                          Jain Mithai Bhandar                       |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((BG_MAROON + WHITE_TEXT)+"| %-7s %-27s %-9s %-12s |"+RESET+"%n","Name   : ",name, "Number       : ",num);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                                                    |"+RESET);
                 System.out.println((BG_MAROON + WHITE_TEXT)+"|                                 LUNCH                              |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                   BILL                             |"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_MAROON+TestMain.WHITE_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                          "Name","Price" ,"Quantity");
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|                                                                    |"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-21s| %-21s| %-21s |"+TestMain.RESET+"%n", 
                              Thali,price,totalPersonA);
                
                 System.out.println((BG_BEIGE + BLACK_TEXT)+"|--------------------------------------------------------------------|"+RESET);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-44s|%-22s |"+TestMain.RESET+"%n", 
                              "Price ",TotalPrice);
                 gst = TotalPrice*18/100;
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-44s|%-22s |"+TestMain.RESET+"%n", 
                              "GST(18%) ",gst);
                 System.out.printf((TestMain.BG_BEIGE + TestMain.BLACK_TEXT)+"|%-44s|%-22s |"+TestMain.RESET+"%n", 
                              "Total Bill ",gst+TotalPrice);
            }
        }
}

class TestMain{
    // ANSI color codes as constants
    public static final String RED_TEXT = "\u001B[31m";
    public static final String RESET = "\u001B[0m";
    public static final String BLACK_TEXT = "\u001B[30m";
    public static final String WHITE_BG = "\u001B[47m";
    public static final String GREEN = "\u001B[102m";
    public final static String BLUE_TEXT = "\u001B[44m";
    public static final String WHITE_TEXT = "\u001B[37m";
    public static final String LIGHT_BLUE_BG = "\u001B[104m";
    public static final String VERY_LIGHT_BLUE_BG = "";
    public static final String BG_MAROON = "\u001B[48;5;52m";
    public static final String BG_BEIGE = "\u001B[48;5;230m";

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to JMB (Jain Mithai Bhandar)");
        System.out.println((BG_BEIGE + BLACK_TEXT)+"------------------------------------------------------------------------"+RESET);
        System.out.println((BG_MAROON + WHITE_TEXT)+"|                   Welcome to JMB (Jain Mithai Bhandar)               |"+RESET);
        System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                        "+RESET);
        System.out.println((BG_MAROON + WHITE_TEXT)+"                     What Type of Meal you want to have ...             "+RESET);
        System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                        "+RESET);
        System.out.println((BG_MAROON + WHITE_TEXT)+"         1. BreakFast                               2. Lunch            "+RESET);
        System.out.println((BG_BEIGE + BLACK_TEXT)+"                                                                        "+RESET);
        int choice = sc.nextInt();
        BreakFast b = new BreakFast();
        Thali t = new Thali();
        switch(choice){
            case 1:
                b.showBreakfast();
                break;
            case 2:
                t.showThali();
                break;
            default:
                System.out.println("Please Enter correct choice ");
        }
    }
}