
import java.util.Scanner;
public class sum {
    public static Scanner sc;
	public static void main(String[] args) {
		int array[] ;
        sc = new Scanner(System.in);
	    System.out.println("Enter the number of elements in array: ");
	    int Size = sc.nextInt();
	    array = new int[Size];
	    System.out.println("Please Enter "+Size+" elements of an Array: ");
	    for(int i=0; i<Size;i++) {
	    	array[i]=sc.nextInt();
	    }
		int sum = 0;
		 System.out.println("The elements are: ");
	    for(int i = 0; i<array.length; i++) {
	    	 if(i%2==0) {
	    		int num = array[i]; 
	    		 sum = sum + array[i];
	    		 System.out.println(num);
	    	 } 
	    }
	    System.out.println("sum = "+sum);
	    sum=0;
	   System.out.println("The elements of odd positions are");
	    for(int i =0; i<array.length; i++) {
	    	 if(i%2!=0) {
	    		int num = array[i]; 
	    		 sum = sum + array[i];
	    		 System.out.println(num);
	    	 }
	    }	
	   
	    System.out.println("sum = "+sum);
	}

}