class TestMain{
    public static void main(String args[]){
        int sum = 0;

        if(args.length == 0){
            System.out.print("Add");
        }
        else{
            int s = args.length;
            int arr[] = new int[s];

            for(int i=0; i<s; i++){
                arr[i] = Integer.parseInt(args[i]);
            }

            for(int i=0; i<s; i++){
                sum += arr[i];
                System.out.print(arr[i]+" ");
            }

            double average = sum/s;
            System.out.print("\nAverage is : " + average);
        }
    }
}