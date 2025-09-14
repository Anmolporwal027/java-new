class TestMain{
 public static void main(String args[]){
    int s = args.length;

    if(s == 0){
        System.out.print("Enter any Parameter");
    }
    else{
        int arr[] = new int[s];
        int max = 0;

        for(int i=0;i<s;i++){
        arr[i]=Integer.parseInt(args[i]);
         }

         for(int i=0; i<s; i++){
            if(arr[i] > max){
                max = arr[i];
            }
         }

         System.out.println("Maximum number of an array : " + max );
        
    }
 }
}