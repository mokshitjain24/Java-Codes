public class odd {
 public static void main(String[] args) {
	 int numb=100,sum=0;
	 System.out.println("the odd numbers are:");
     for(int i=0;i<=numb;i++) {
    	 if(i%2==1) {
    		 System.out.println(i);
    		 sum=sum+i;
    	 }
     }
     System.out.println("the sum is:" +sum);
 }
}
