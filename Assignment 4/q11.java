// 11) WAP to manage Child vaccination 
import java.util.Scanner;
class Child{
String name;
int age;
int choice; 
String vaccine[] = new String[5];   

    Child(String name, int age, int choice, String[] vaccine) {
        this.name = name;
        this.age = age;
        this.choice = choice;
        this.vaccine = vaccine;
    }

    void showData() {
        System.out.println("\nChild: " + name + ", Age: " + age);
        System.out.println("Vaccine Assigned: " + vaccine[choice-1]);
    }
}

class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Child c[] = new Child[50];
        String vaccine[] = {"Polio","tetnes","hepetitis","weakness","immune"};
        int childcnt = 0;


        while(true){
            System.out.println("\n-----Child Vaccination Menu------");
            System.out.println("1. Register Vaccin to child ");
            System.out.println("2. Show Details");
            System.out.println("3. Exit Menu ");
            System.out.println("Enter your choice ");
            int n = sc.nextInt();

            switch(n){
                case 1:
                        sc.nextLine();
                        System.out.println("Enter name of the child "+(childcnt+1));
                        String name = sc.nextLine();
                        System.out.println("Enter age of child ");
                        int age = sc.nextInt();
                        System.out.println("Enter which vaccine you want to assign");
                        for(int i=0; i<5; i++){
                            System.out.println("Enter "+(i+1)+" for "+vaccine[i]);
                        }
                        int choice = sc.nextInt();
                        c[childcnt] = new Child(name,age,choice,vaccine);
                        childcnt++;
                        System.out.println("Vaccine Assigned Successfully ");
                        break;
                case 2:
                      System.out.println("\n---- Child Details ----");
                        for(int i=0; i<childcnt; i++) {
                            c[i].showData();
                        }
                    break;
                case 3:
                    System.out.println("Exiting child vaccination ");
                    return;
            }
        }
    
    }
}