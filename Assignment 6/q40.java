import java.util.Scanner;

class TestMain{

void merge(int arr1[],int arr2[],int f, int s){
    int arr3[] = new int[f + s];
      
    for(int i=0; i<f; i++){
         arr3[i] = arr1[i] ;

    }
       
    for(int i=0; i<s; i++){
         arr3[f+i] = arr2[i];

    }

      System.out.println("\nArray 1... ");  
    for(int i=0; i<f; i++){
      System.out.print(arr1[i] + " "); 
    }
      System.out.println("\nArray 2... "); 
    for(int i=0; i<f; i++){
      System.out.print(arr2[i] + " "); 
    }
      System.out.println("\nArray 3... "); 
    for(int i=0; i<(f+s); i++){
      System.out.print(arr3[i] + " "); 
    }

}


    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter first array size: ");
    int f = sc.nextInt();
    System.out.print("Enter Second array size: ");
    int s = sc.nextInt();
    
    int arr1[] = new int[f];
    int arr2[] = new int[s];

    System.out.println("Enter first Array elements");
    for(int i=0; i<f; i++){
        arr1[i] = sc.nextInt();
    }
     
    

    System.out.println("Enter Second Array elements");
    for(int i=0; i<s; i++){
        arr2[i] = sc.nextInt();
    }

    TestMain que = new TestMain();
    que.merge(arr1,arr2,f,s);

    }
}