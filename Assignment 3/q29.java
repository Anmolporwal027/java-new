/*
    29. Write a program to calculate gross salary and net salary. Accept basic salary from user,
TA(Travel Allowance) i.e 10% of basic salary, PF(Provident Fund) i.e 7.8% of basic ,DA(Dearness Allowance) is 500, gs=basic+da+ta; ns=gs-pf;

 */
import java.util.Scanner;
class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        double ta = basic * 0.10;   
        double pf = basic * 0.078;  
        double da = 500;            
        double gs = basic + da + ta;
        double ns = gs - pf;

        System.out.println("Basic Salary: "+basic);
        System.out.println("Travel Allowance: "+ta);
        System.out.println("Provident Fund: "+pf);
        System.out.println("Dearness Allowance: "+da);
        System.out.println("Gross Salary: "+gs);
        System.out.println("Net Salary: "+ns);

    }
}
