
   class pyramid {
	public static void main(String ar[])
	{
	
	int i,j,k,sp=10 ;
	for(i=1;i<=6;i++)
	{
		for(k=1;k<=sp;k++)
		{
			System.out.print(" ");
		}
		for(j=i;j>1;j--)
		{
			System.out.print(' '+" *"+' ');
			
	}
    sp=sp-2;
    System.out.println('\n');
    }
	
  }
}