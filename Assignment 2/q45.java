/*
    Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .
 */
class test{
    public static void main(String[] args) {
        int fistterm = -21;      // First term
        int d = 3;  // difference
        int n = 28;// total

        int sum = (n * (2 * fistterm + (n - 1) * d)) / 2;

        System.out.println(" sum of first 28 terms " + sum);
    }
}