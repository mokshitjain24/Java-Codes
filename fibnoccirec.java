

public class fibnoccirec {
 int a = 0,b = 1,sum = 0;
 void printFibonacci(int size, int t) {
	 if(size>0) {
		 if(t == 0) {
			 size = size - 2;
			 System.out.print(a+ " " + b);
		 }
		 sum = a+b;
		 a = b;
		 b = sum;
		 t = 1;
		 System.out.print(" "+ sum);
		 printFibonacci(size-1,t);
	 }
  }
  public static void main(String[] args) {
	  fibnoccirec fib = new fibnoccirec();
	  int count = 5;
	  fib.printFibonacci(count,0);  
  }
}
