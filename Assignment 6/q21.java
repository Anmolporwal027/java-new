import java.util.Scanner;

class TestMain{
    void findGrade(int total) {
        double per = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + per);

        if (per >= 75 && per <= 100) {
            System.out.println("Grade: A");
        } else {
            if (per >= 60 && per < 75) {
                System.out.println("Grade: B");
            } else {
                if (per >= 50 && per < 60) {
                    System.out.println("Grade: C");
                } else {
                    if (per >= 33 && per < 50) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Fail");
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        int total = 0;
        for(int i=0; i<5; i++){
            System.out.println("Enter marks of subject "+(i+1));
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        TestMain obj = new TestMain();
        obj.findGrade(total);
    }
}
