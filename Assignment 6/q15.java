import java.util.Scanner;

class TestMain{
void temp(int f){
  double c = (f - 32) * 5 / 9;
System.out.print("Temperature in Celcius: "+c);
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter temprature in Fahrenheit: ");
int f = sc.nextInt();

TestMain obj = new TestMain();

obj.temp(f);


  }
}

