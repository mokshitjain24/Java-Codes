
public class pattern5{
	public static void main(String ar[] ) {
		int i,j,k,s=5;
		for(i=s;i>=1;i--)
		{
			for(j=s;j>i;j--)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(k=1;k<2*(i-1);k++)
			{
				System.out.print(" ");
			}
			if(i==1)
			{
				System.out.println("");
			}
			else
			{
				System.out.println("*");
			}
		}
		
	}
}