class TestMain{
    public static void main(String args[]){
        int a =1 , b=2,c=3,d=5 ;
        if(a>=b && a>=c && a>=d){
            System.out.println(a+" is greatest");
        }
        else if(b>=a && b>=c && b>=d){
            System.out.println(b+" is greatest");
        }
        else if(c>=a && c>=b && c>=d){
            System.out.println(c+" is greatest");
        }else{
            System.out.println(d+" is greatest");
        }

    }
}