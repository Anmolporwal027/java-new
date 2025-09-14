import java.util.Scanner;

class TestMain{
    void Interest(double p, double r, double t) {
        if (p >= 500) {
            double amount = p * Math.pow((1 + r / 100), t);
            double ci = amount - p;
            System.out.println("Principal: " + p);
            System.out.println("Rate: " + r);
            System.out.println("Time: " + t);
            System.out.println("Compound Interest: " + ci);
        } else {
            double si = (p * r * t) / 100;
            System.out.println("Principal: " + p);
            System.out.println("Rate: " + r);
            System.out.println("Time: " + t);
            System.out.println("Simple Interest: " + si);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();
        TestMain obj = new TestMain();
        obj.Interest(p, r, t);
    }
}
