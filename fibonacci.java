import java.util.Scanner;
public class fibonacci {
  public static void main(String[] args) {
	  int i=1,a=0,b=1;
	  Scanner input = new Scanner(System.in);
	  System.out.println("Number of Fibonacci elements: ");
	  int num = input.nextInt();
	  System.out.print("Fibonacci numbers are: ");
	  while(i <= num) {
		  System.out.print(a+ " ");
		  int sum = a + b;
		  a = b;
		  b = sum;
		  i++;
	  }
	  input.close();
  }
  
}
