class TestMain{
    public static void main(String args[]){
        int a = 4;
        boolean chk = (a%2==0)?true:false;
        if(chk)
            System.out.println("Even : "+a);
        else
            System.out.println("Odd : "+a);
    }
}