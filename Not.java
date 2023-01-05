public class Not {
   int out;
   public int not(int in) {
	   Nand NAND = new Nand();
	   out =  NAND.nand(in, in);
   return(out);
   }
   public static void main(String ar[]) {
		Not obj = new Not();
		System.out.println(obj.not(0));
		
}
}