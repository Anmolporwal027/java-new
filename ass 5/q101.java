//our logic here is to print 1 then add the i to the number then add the i again in the total
/*
*                             --> 1 time
**                            --> 1+1(previous count)=2(i will added to add after printing 1 time)
****                          --> 2+2=4
*******                       --> 3+4=7
***********                   --> 4+7=11
****************              --> 5+11=16
 */
class Q101{
    public static void main(String args[]){
        int add = 1;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=add; j++){
                System.out.print("*");
            }
            add += i;
            System.out.println();
        }
    }
}