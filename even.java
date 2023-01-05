
public class even {
 public static void main(String[] args) {
	 int numb=100,sum=0;
	 System.out.println("the even numbers are:");
     for(int i=0;i<=numb;i++) {
    	 if(i%2==0) {
    		 System.out.println(i);
    		 sum=sum+i;
    	 }
     }
     System.out.println("the sum is:" +sum);
 }
}
