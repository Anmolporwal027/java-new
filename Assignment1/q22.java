class TestMain{
    public static void main(String args[]){
        int a = 5;
        int b = 7;
        int c = 1;
        int greater = (a>b)
                        ?(a>c?a:c)
                        :(b>c?b:c);
        System.out.println("Greater no is "+greater);
    }
}