import java.util.Scanner;
public class Syncc {	
	public int[] DTB(int in) {
		int out[] = new int[4];
		int binary[] = new int[4];    
	     int index = 0;    
	     while(in > 0){    
	       binary[index++] = in%2;    
	       in = in/2;    }         
	       out[0] = binary[3] ; 
	       out[1] = binary[2] ; 
	       out[2] = binary[1] ; 
	       out[3] = binary[0] ; 
	       return out;
	}    	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter the clock time");
	    int p = myObj.nextInt(); 
	    int t = 10-p;

	    if (p<=10) {
		    if(p==0) {
		    	System.out.println("The clocktime should be greater than 0, the chip is loaded just now");
		    }
		    else {
	    	System.out.println("Output = q3 q2 q1 q0:"); 
		    Syncc SYNCC = new Syncc();
		    
		    int[] temp = SYNCC.DTB(t);   
	        for (int i=0;i<=3;i++) {
	        System.out.print(temp[i]);}
		    }		  
		    }
	    else {
	    	System.out.println("The clock is out of range");
	    }
	    }
	    
	}
