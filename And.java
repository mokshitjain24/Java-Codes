class And  {
	int out;
	public int and(int a, int b) {
	   Nand NAND = new Nand();
	   out = NAND.nand(NAND.nand(a, b),NAND.nand(a, b));
	return out ;
		}
	public static void main(String ar[]) {
		And obj = new And();
		System.out.println(obj.and(0, 1));
		
}
}
