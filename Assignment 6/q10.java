class TestMain{
 public static void main(String args[]){
    int s = args.length;

    if(s == 0){
        System.out.print("Enter any Parameter");
    }
    else{
        int arr[] = new int[s];

        for(int i=0;i<s;i++){
         arr[i]=Integer.parseInt(args[i]);
         }
        int min = arr[0];

         for(int i=0; i<s; i++){
            if(arr[i] < min){
                min = arr[i];
            }
         }

         System.out.println("Minimum number of an array : " + min );
        
    }
 }

}
