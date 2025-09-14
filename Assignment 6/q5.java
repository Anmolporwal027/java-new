
class TestMain{
    public static void main(String[] args) {
 
        int s = args.length;
        int arr[] = new int[s];

         for(int i=0; i<s; i++){
            arr[i]=Integer.parseInt(args[i]);

        }

        for (int i = 0; i < s; i++) {
            int num = arr[i];
            int rev = 0;
            while (num > 0) {
                rev = rev * 10 + num % 10;
                num = num / 10;
            }
            arr[i] = rev; 
        }

        
        System.out.println("Array after reversing individual elements:");
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

