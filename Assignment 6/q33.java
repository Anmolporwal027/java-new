import java.util.Scanner;

class TestMain {

    void Series(int n) {
        char ch = 'A'; 
        char small = 'a'; 

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { 
                System.out.print(ch + " ");
            } else {
                System.out.print(small + " ");
            }
                small++; 
                ch++;   
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int n = sc.nextInt();

        TestMain obj = new TestMain();
        obj.Series(n);
    }
}