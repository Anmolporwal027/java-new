// 59) WAP to find out the sum of all integer between 100 and 200 which are divisible by 9
class Q59{
    public static void main(String args[]){
        for(int i=100; i<=200; i++){
            if(i%9 == 0){
                System.out.println("Divisible by 9 "+i);
            }
        }
    }
}