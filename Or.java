
public class Or {
         int out;
         public int or(int a, int b) {
        	 Nand NAND = new Nand();
        	 out = NAND.nand(NAND.nand(a, a), NAND.nand(b, b));
         return(out);
         }
         public static void main(String ar[]) {
        		Or obj = new Or();
        		System.out.println(obj.or(0, 0));
        		
}
}
