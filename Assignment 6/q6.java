class TestMain{

public static void main(String args[]){

int s = args.length;

int arr[] = new int[s];
int count = 0;

for(int i=0;i<s;i++){
arr[i]=Integer.parseInt(args[i]);

}

System.out.print("Array: ");
for(int i=0;i<s;i++){
System.out.print(arr[i]+" ");
}


boolean flag = false;
for(int i=0; i<s/2; i++){
    if(arr[i] == arr[s-i-1]){
        flag = true;
    }
    else{
        flag = false;
        break;
    }
}


if(flag){
System.out.print("\nIt is a Palindrome Array");
}
else{
System.out.print("\nIt is not a Palindrome Array");
}

}
}