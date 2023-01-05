import java.util.Scanner;

public class linear {
	char [] hash = new char[10];
	public int hash(char c) {
		int w =c;
	    int id = w%hash.length;
	    if(hash[id]!=0) {
	    	while(id<hash.length) {
	    		if(hash[id]==0) {
	    			break;
	    		}
	    		else {
	    			if(id== hash.length -1) {
	    				id= 0;
	    			}
	    			else
	    				id+=1;
	    		}
	    	}
	    }
	    hash[id]=c;
	    return id;
	    
	}
	public void disphashtable() {
		System.out.println("The Hash table is ");
		for (int i = 0; i < hash.length; i++) {
			System.out.print(" " + hash[i]);
		}
	} 
	
 public static void main(String[] ar) {
	 Scanner scan = new Scanner(System.in);
	 linear obj = new linear();
		System.out.println("input a word");
		String str = scan.next();
		for (int i = 0; i < str.length(); i++) {
			int j = str.charAt(i);
			System.out.println("ascii value of " + str.charAt(i) + " is " + j);
			System.out.println("hash value of " +str.charAt(i)+" is "+obj.hash(str.charAt(i)));
		}
		obj.disphashtable();
		scan.close();
		
  }
 }
		


