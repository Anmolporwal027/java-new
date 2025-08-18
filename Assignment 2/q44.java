/*
    Find the 28th term of an Arithmetic Progression -21 -18 -15 -12 . . . . . 
 */
class test{
    public static void main(String args[]){
        int fistterm = -21;
        int difference = 3;
        int n = 28;
        
        // formula
        int ap = fistterm + ( n - 1 )* difference;

        System.out.println("29th term is  "+ap);
    }
}