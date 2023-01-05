
    class invertedpyramid {
	public static void main(String ar[])
	{
	
	int i,j,k,sp=1 ;
	
	for(i=5;i>=1;i--)
	{
		for(k=1;k<=sp;k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(' '+"* "+' ');
	}
    System.out.println();
    sp=sp+2;
    }
  }
}