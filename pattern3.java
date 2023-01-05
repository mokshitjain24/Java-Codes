
   class pattern3 {
	public static void main(String ar[])
	{
	
	int i,j,k,sp=20 ;
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
	int s=13;
	
	for(i=4;i>=1;i--)
	{
		for(k=1;k<=s;k++)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(' '+"* "+' ');
			
		}
    System.out.println('\n');
    s=s+2;
    }
  }
}