
class TestMain{
    public static void main(String args[]){
    if(args.length == 0){
     System.out.println("Enter array element at command line argument");
    }
    else{
        int s = args.length;
        int arr[] = new int[s];

        for(int i=0; i<s; i++){
            arr[i]=Integer.parseInt(args[i]);

        }

        for(int i=0; i<s/2; i++){
            int temp = arr[i];
            arr[i] = arr[s-i-1];
            arr[s-i-1] = temp;
        }

        for(int i=0; i<s; i++){
            System.out.print(arr[i] + " ");
        }
    }
    }
}