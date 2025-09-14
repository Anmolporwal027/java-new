import java.util.Scanner;

class TestMain {
    void checkLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is NOT a Leap Year");
                }
            } else {
                System.out.println(year + " is a Leap Year");
            }
        } else {
            System.out.println(year + " is NOT a Leap Year");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = sc.nextInt();

        TestMain obj = new TestMain();
        obj.checkLeap(year);
    }
}
