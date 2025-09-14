class TestMain{
public static void main(String args[]){
int sum=0;
if(args.length == 0){
System.out.println("Enter array element at command line argument");
}
else{
int s = args.length;
int arr[] = new int[s];

for(int i=0;i<s;i++){
arr[i]=Integer.parseInt(args[i]);
sum += arr[i];
}

System.out.println("\nSum of array: "+(sum));
}

}
}